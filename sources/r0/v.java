package r0;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class v extends x {
    public final /* synthetic */ int e;

    public v(int i7, Class cls, int i10, int i11, int i12) {
        this.e = i12;
        this.a = i7;
        this.d = cls;
        this.c = i10;
        this.b = i11;
    }

    @Override // r0.x
    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(d0.c(view));
            case 1:
                return d0.a(view);
            default:
                return Boolean.valueOf(d0.b(view));
        }
    }

    @Override // r0.x
    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                d0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                d0.e(view, (CharSequence) obj);
                break;
            default:
                d0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // r0.x
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
