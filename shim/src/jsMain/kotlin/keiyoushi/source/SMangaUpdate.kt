package keiyoushi.source

import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga

class SMangaUpdate(
    val manga: suspend () -> SManga,
    val chapters: suspend () -> List<SChapter>,
) {
    constructor(manga: SManga, chapters: List<SChapter>) : this({ manga }, { chapters })
    constructor(manga: SManga, chapters: suspend () -> List<SChapter>) : this({ manga }, chapters)
}
