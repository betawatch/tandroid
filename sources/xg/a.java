package xg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public enum a {
    f(R.raw.tab_contacts),
    h(R.raw.tab_calls),
    n(R.raw.tab_chats),
    r(R.raw.tab_settings),
    s("CHECKLIST", R.raw.tab_checklist_reverse),
    v("COLORS", R.raw.tab_colors_reverse),
    w("FILES", R.raw.tab_files_reverse),
    x("GALLERY", R.raw.tab_gallery_reverse),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("GIFT", R.raw.tab_gift_reverse),
    y("LOCATION", R.raw.tab_location_reverse),
    A("STICKER", R.raw.tab_sticker_reverse),
    B("EMOJI", R.raw.tab_emoji_reverse),
    C("MODELS", R.raw.tab_models_reverse),
    D("MUSIC", R.raw.tab_music_reverse),
    E("POLL", R.raw.tab_poll_reverse),
    F("SYMBOLS", R.raw.tab_symbols_reverse),
    G("REPLIES", R.raw.tab_reply_reverse),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("WALLET", R.raw.tab_wallet_reverse),
    H,
    I("ARTICLE", R.raw.tab_article_reverse),
    J(R.raw.boosts, 25, 49),
    K(R.raw.monetize, 19, 45);

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
