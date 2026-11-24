// default package

import android.content.SharedPreferences;
import android.util.LongSparseArray;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sp9 extends rp9 {
    public byte d;

    public static sp9 d(String str, SharedPreferences sharedPreferences) {
        sp9 sp9Var = new sp9();
        sp9Var.a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        sp9Var.b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        sp9Var.c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return sp9Var;
    }

    @Override // rp9
    public final void b() {
        super.b();
        mte.f(this.d);
    }

    public final CharSequence c(int i) {
        StringBuilder sb = new StringBuilder();
        if (a()) {
            if (this.a) {
                sb.append(k96.M0(2131745728, null));
            }
            if (this.b) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745721, null));
                long j = this.c;
                if (j > 0 && j < 4194304000L) {
                    sb.append(" (");
                    sb.append(gl.i0(this.c, true, false));
                    sb.append(")");
                }
            }
        } else {
            sb.append(k96.M0(2131745729, null));
        }
        LongSparseArray l = y6c.h(i).l(this.d);
        if (l.size() != 0) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(k96.G(l.size(), "Exception", Integer.valueOf(l.size())));
        }
        return sb;
    }

    public final void e(String str, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), this.a).putBoolean(str.concat("_save_gallery_video"), this.b).putLong(str.concat("_save_gallery_limitVideo"), this.c).apply();
    }
}
