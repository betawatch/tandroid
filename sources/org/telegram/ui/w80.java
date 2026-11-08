package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public enum w80 {
    h("DefaultIcon", R.drawable.icon_background_sa, R.mipmap.icon_foreground_sa, 2131754237, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF39("VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, 2131754233, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF59("AquaIcon", R.drawable.icon_4_background_sa, R.mipmap.icon_foreground_sa, 2131754239, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF79("PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, 2131754235, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF99("TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, 2131754234, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF119("NoxIcon", R.mipmap.icon_2_background_sa, R.mipmap.icon_foreground_sa, 2131754236, true);

    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public ComponentName f;

    w80(String str, int i7, int i10, int i11, boolean z9) {
        this.a = str;
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.e = z9;
    }

    public final ComponentName a(Context context) {
        if (this.f == null) {
            this.f = new ComponentName(context.getPackageName(), "org.telegram.messenger." + this.a);
        }
        return this.f;
    }
}
