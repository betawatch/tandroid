package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public enum y80 {
    h("DefaultIcon", R.drawable.icon_background_sa, R.mipmap.icon_foreground_sa, 2131754235, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF39("VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, 2131754231, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF59("AquaIcon", R.drawable.icon_4_background_sa, R.mipmap.icon_foreground_sa, 2131754237, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF79("PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, 2131754233, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF99("TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, 2131754232, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF119("NoxIcon", R.mipmap.icon_2_background_sa, R.mipmap.icon_foreground_sa, 2131754234, true);

    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public ComponentName f;

    y80(String str, int i7, int i10, int i11, boolean z10) {
        this.a = str;
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.e = z10;
    }

    public final ComponentName a(Context context) {
        if (this.f == null) {
            this.f = new ComponentName(context.getPackageName(), "org.telegram.messenger." + this.a);
        }
        return this.f;
    }
}
