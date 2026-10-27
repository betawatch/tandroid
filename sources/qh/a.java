package qh;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public enum a {
    f(R.raw.tab_contacts),
    h(R.raw.tab_news),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(R.raw.tab_calls),
    n(R.raw.tab_chats),
    r(R.raw.tab_settings),
    s("CHECKLIST", R.raw.tab_checklist_reverse),
    v("COLORS", R.raw.tab_colors_reverse),
    w("FILES", R.raw.tab_files_reverse),
    x("GALLERY", R.raw.tab_gallery_reverse),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("GIFT", R.raw.tab_gift_reverse),
    y("LOCATION", R.raw.tab_location_reverse),
    E("STICKER", R.raw.tab_sticker_reverse),
    F("EMOJI", R.raw.tab_emoji_reverse),
    G("MODELS", R.raw.tab_models_reverse),
    H("MUSIC", R.raw.tab_music_reverse),
    I("POLL", R.raw.tab_poll_reverse),
    J("SYMBOLS", R.raw.tab_symbols_reverse),
    K("REPLIES", R.raw.tab_reply_reverse),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("WALLET", R.raw.tab_wallet_reverse),
    L,
    M("ARTICLE", R.raw.tab_article_reverse),
    N("GRAM", R.raw.gram_reverse),
    O(R.raw.boosts, 25, 49),
    P(R.raw.monetize, 19, 45),
    Q(R.raw.msg_stories_saved, 20, 40),
    R(R.raw.msg_stories_archive);

    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    a(int i10, int i11, int i12) {
        this.a = i10;
        this.b = i10;
        this.d = i11;
        this.e = i12;
        this.c = -1;
    }

    a(int i10) {
        this.c = i10;
        this.a = -1;
        this.b = -1;
        this.d = -1;
        this.e = -1;
    }

    a(int i10) {
        this.a = i10;
        this.b = i10;
        this.d = -1;
        this.e = -1;
        this.c = -1;
    }

    a(String str, int i10) {
        this.a = r2;
        this.b = i10;
        this.d = -1;
        this.e = -1;
        this.c = -1;
    }
}
