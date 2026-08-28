package r0;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x extends p1.c {
    public final /* synthetic */ int e;

    public x(int i9, Class cls, int i10, int i11, int i12) {
        this.e = i12;
        this.a = i9;
        this.d = cls;
        this.c = i10;
        this.b = i11;
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
