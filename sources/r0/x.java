package r0;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x extends p1.c {
    public final /* synthetic */ int e;

    public x(int i10, Class cls, int i11, int i12, int i13) {
        this.e = i13;
        this.a = i10;
        this.d = cls;
        this.c = i11;
        this.b = i12;
    }

    @Override // p1.c
    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(e0.c(view));
            case 1:
                return e0.a(view);
            default:
                return Boolean.valueOf(e0.b(view));
        }
    }

    @Override // p1.c
    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                e0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                e0.e(view, (CharSequence) obj);
                break;
            default:
                e0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p1.c
    public final boolean e(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
