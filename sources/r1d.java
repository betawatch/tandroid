// default package

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class r1d implements View.OnApplyWindowInsetsListener {
    public final j1d a;
    public l2d b;

    public r1d(FrameLayout frameLayout, j1d j1dVar) {
        l2d l2dVar;
        this.a = j1dVar;
        WeakHashMap weakHashMap = ihc.a;
        l2d a = bhc.a(frameLayout);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            l2dVar = (i >= 34 ? new a2d(a) : i >= 30 ? new z1d(a) : i >= 29 ? new y1d(a) : new x1d(a)).b();
        } else {
            l2dVar = null;
        }
        this.b = l2dVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = l2d.h(view, windowInsets);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        l2d h = l2d.h(view, windowInsets);
        i2d i2dVar = h.a;
        l2d l2dVar = this.b;
        if (l2dVar == null) {
            WeakHashMap weakHashMap = ihc.a;
            l2dVar = bhc.a(view);
            this.b = l2dVar;
        }
        if (l2dVar == null) {
            this.b = h;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            j1d i = s1d.i(view);
            if (i == null || !Objects.equals(i.a, h)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                l2d l2dVar2 = this.b;
                int i2 = 1;
                while (i2 <= 512) {
                    mq5 f = i2dVar.f(i2);
                    mq5 f2 = l2dVar2.a.f(i2);
                    int i3 = f.a;
                    int i4 = f.d;
                    int i5 = f.c;
                    int i6 = f.b;
                    int i7 = f2.a;
                    int i8 = f2.d;
                    int i9 = f2.c;
                    int i10 = f2.b;
                    if (i3 > i7 || i6 > i10 || i5 > i9 || i4 > i8) {
                        iArr = iArr2;
                        z = true;
                    } else {
                        iArr = iArr2;
                        z = false;
                    }
                    if (z != (i3 < i7 || i6 < i10 || i5 < i9 || i4 < i8)) {
                        if (z) {
                            iArr[0] = iArr[0] | i2;
                        } else {
                            iArr3[0] = iArr3[0] | i2;
                        }
                    }
                    i2 <<= 1;
                    iArr2 = iArr;
                }
                int i11 = iArr2[0];
                int i12 = iArr3[0];
                int i13 = i11 | i12;
                if (i13 == 0) {
                    this.b = h;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    l2d l2dVar3 = this.b;
                    w1d w1dVar = new w1d(i13, (i11 & 8) != 0 ? s1d.e : (i12 & 8) != 0 ? s1d.f : (i11 & 519) != 0 ? s1d.g : (i12 & 519) != 0 ? s1d.h : null, (i13 & 8) != 0 ? 160L : 250L);
                    w1dVar.a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w1dVar.a.a());
                    mq5 f3 = i2dVar.f(i13);
                    mq5 f4 = l2dVar3.a.f(i13);
                    int min = Math.min(f3.a, f4.a);
                    int i14 = f3.b;
                    int i15 = f4.b;
                    int min2 = Math.min(i14, i15);
                    int i16 = f3.c;
                    int i17 = f4.c;
                    int min3 = Math.min(i16, i17);
                    int i18 = f3.d;
                    int i19 = f4.d;
                    k7b k7bVar = new k7b(mq5.b(min, min2, min3, Math.min(i18, i19)), mq5.b(Math.max(f3.a, f4.a), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)), (byte) 8);
                    s1d.f(view, h, false);
                    duration.addUpdateListener(new q1d(w1dVar, h, l2dVar3, i13, view));
                    duration.addListener(new wd8((Object) w1dVar, view, (byte) 25));
                    uy1 uy1Var = new uy1(view, w1dVar, k7bVar, duration);
                    if (view != null) {
                        qt7 qt7Var = new qt7(view, uy1Var);
                        view.getViewTreeObserver().addOnPreDrawListener(qt7Var);
                        view.addOnAttachStateChangeListener(qt7Var);
                    } else {
                        p3d.h("view == null");
                    }
                    this.b = h;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
