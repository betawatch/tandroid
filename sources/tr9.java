// default package

import android.content.SharedPreferences;
import android.util.LongSparseArray;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tr9 extends sr9 {
    public byte d;

    public static tr9 d(String str, SharedPreferences sharedPreferences) {
        tr9 tr9Var = new tr9();
        tr9Var.a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        tr9Var.b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        tr9Var.c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return tr9Var;
    }

    @Override // sr9
    public final void b() {
        super.b();
        pve.f(this.d);
    }

    public final CharSequence c(int i) {
        StringBuilder sb = new StringBuilder();
        if (a()) {
            if (this.a) {
                sb.append(jb6.M0(2131745654, null));
            }
            if (this.b) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745647, null));
                long j = this.c;
                if (j > 0 && j < 4194304000L) {
                    sb.append(" (");
                    sb.append(gm.i0(this.c, true, false));
                    sb.append(")");
                }
            }
        } else {
            sb.append(jb6.M0(2131745655, null));
        }
        LongSparseArray l = z8c.h(i).l(this.d);
        if (l.size() != 0) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(jb6.G(l.size(), "Exception", Integer.valueOf(l.size())));
        }
        return sb;
    }

    public final void e(String str, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), this.a).putBoolean(str.concat("_save_gallery_video"), this.b).putLong(str.concat("_save_gallery_limitVideo"), this.c).apply();
    }
}
