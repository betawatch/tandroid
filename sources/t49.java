// default package

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t49 implements View.OnLayoutChangeListener {
    public final /* synthetic */ y59 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ u49 d;
    public final /* synthetic */ cw6 e;

    public t49(cw6 cw6Var, y59 y59Var, ArrayList arrayList, boolean z, u49 u49Var) {
        this.e = cw6Var;
        this.a = y59Var;
        this.b = arrayList;
        this.c = z;
        this.d = u49Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        final ArrayList arrayList;
        int height;
        int i9;
        long min;
        View view2;
        cw6 cw6Var = this.e;
        HashMap hashMap = (HashMap) cw6Var.w;
        r59 r59Var = (r59) cw6Var.e;
        r59Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        r59Var.D0();
        int childCount = r59Var.getChildCount();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z = false;
        while (true) {
            arrayList = this.b;
            if (i10 >= childCount) {
                break;
            }
            View childAt = r59Var.getChildAt(i10);
            arrayList2.add(childAt);
            if (childAt.getTop() < i11) {
                i11 = childAt.getTop();
            }
            if (childAt.getBottom() > i12) {
                i12 = childAt.getBottom();
            }
            if (childAt instanceof mk5) {
                ((mk5) childAt).b(true, false);
            }
            y59 y59Var = this.a;
            if (y59Var != null && (y59Var.b || cw6Var.c)) {
                r59Var.getClass();
                long c = y59Var.c(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(c)) && (view2 = (View) hashMap.get(Long.valueOf(c))) != 0) {
                    if (view2 instanceof mk5) {
                        ((mk5) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    nue nueVar = (nue) cw6Var.r;
                    if (nueVar != null) {
                        nueVar.d(view2);
                    }
                    int top = childAt.getTop() - view2.getTop();
                    if (top != 0) {
                        i13 = top;
                    }
                    z = true;
                }
            }
            i10++;
        }
        hashMap.clear();
        int size = arrayList.size();
        int i14 = 0;
        int i15 = 0;
        int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i14) {
                i14 = bottom;
            }
            if (top2 < i16) {
                i16 = top2;
            }
            if (view3.getParent() == null) {
                r59Var.addView(view3);
                ((u46) cw6Var.f).L(view3);
            }
            if (view3 instanceof mk5) {
                ((mk5) view3).b(true, true);
            }
        }
        int i17 = i16 == Integer.MAX_VALUE ? 0 : i16;
        nue nueVar2 = (nue) cw6Var.r;
        if (nueVar2 != null) {
            nueVar2.b();
        }
        if (arrayList.isEmpty()) {
            i9 = Math.abs(i13);
        } else {
            if (this.c) {
                height = -i11;
            } else {
                i14 = r59Var.getHeight() - i17;
                height = i12 - r59Var.getHeight();
            }
            i9 = height + i14;
        }
        final int paddingBottom = r59Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) cw6Var.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) cw6Var.h).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        cw6Var.h = ofFloat;
        final boolean z2 = this.c;
        final int i18 = i9;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: s49
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z3;
                int i19;
                cw6 cw6Var2 = t49.this.e;
                r59 r59Var2 = (r59) cw6Var2.e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i20 = 0;
                while (true) {
                    z3 = z2;
                    i19 = i18;
                    if (i20 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i20);
                    float y = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y <= r59Var2.getMeasuredHeight()) {
                        if (z3) {
                            view4.setTranslationY((-i19) * floatValue);
                        } else {
                            view4.setTranslationY(i19 * floatValue);
                        }
                    }
                    i20++;
                }
                int paddingBottom2 = paddingBottom - r59Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i21 = 0; i21 < size3; i21++) {
                    View view5 = (View) arrayList4.get(i21);
                    if (z3) {
                        view5.setTranslationY(((1.0f - floatValue) * i19) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i19));
                    }
                }
                r59Var2.invalidate();
                v49 v49Var = (v49) cw6Var2.n;
                if (v49Var != null) {
                    v49Var.e();
                }
            }
        });
        ((ValueAnimator) cw6Var.h).addListener(new ic8(this, arrayList2, (byte) 6));
        if (!cw6Var.d) {
            if (z) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i18 / r59Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) cw6Var.h).setDuration(min);
            ((ValueAnimator) cw6Var.h).setInterpolator(d53.h);
        } else if (z) {
            ((ValueAnimator) cw6Var.h).setDuration(150L);
            ((ValueAnimator) cw6Var.h).setInterpolator(d53.g);
        } else {
            long measuredHeight2 = (long) (((i18 / r59Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) cw6Var.h).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) cw6Var.h).setInterpolator(d53.h);
        }
        ((ValueAnimator) cw6Var.h).start();
    }
}
