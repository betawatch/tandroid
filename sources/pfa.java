// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pfa implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ sea a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ tk4 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ nha e;

    public pfa(nha nhaVar, sea seaVar, SparseBooleanArray sparseBooleanArray, tk4 tk4Var, int i) {
        this.e = nhaVar;
        this.a = seaVar;
        this.b = sparseBooleanArray;
        this.c = tk4Var;
        this.d = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        nha nhaVar = this.e;
        nhaVar.getViewTreeObserver().removeOnPreDrawListener(this);
        final sea seaVar = this.a;
        y59 adapter = seaVar.getAdapter();
        final byte b = 2;
        final byte b2 = 1;
        final byte b3 = 0;
        if (adapter == nhaVar.K || adapter == nhaVar.N || adapter == nhaVar.P || adapter == nhaVar.O) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = seaVar.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    int Q = nha.Q(seaVar.getChildAt(i));
                    if (Q != 0 && sparseBooleanArray.get(Q, false)) {
                        nhaVar.S1.put(Q, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new u34(this, Q, seaVar));
                        ofFloat.addListener(new co(this, Q, (byte) 12));
                        ofFloat.setStartDelay((int) ((Math.min(seaVar.getMeasuredHeight(), Math.max(0, r10.getTop())) / seaVar.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ofa
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b4 = b3;
                                sea seaVar2 = seaVar;
                                switch (b4) {
                                    case 0:
                                        if (seaVar2.c1()) {
                                            seaVar2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (seaVar2.c1()) {
                                            seaVar2.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (seaVar2.c1()) {
                                            seaVar2.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    seaVar.invalidate();
                }
            }
            return true;
        }
        int childCount2 = seaVar.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt = seaVar.getChildAt(i2);
            tk4 tk4Var = this.c;
            if (childAt != tk4Var && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(seaVar.getMeasuredHeight(), Math.max(0, childAt.getTop())) / seaVar.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ofa
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b4 = b2;
                        sea seaVar2 = seaVar;
                        switch (b4) {
                            case 0:
                                if (seaVar2.c1()) {
                                    seaVar2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                if (seaVar2.c1()) {
                                    seaVar2.invalidate();
                                    break;
                                }
                                break;
                            default:
                                if (seaVar2.c1()) {
                                    seaVar2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (tk4Var != null && tk4Var.getParent() == null) {
                seaVar.addView(tk4Var);
                f69 layoutManager = seaVar.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.L(tk4Var);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tk4Var, (Property<tk4, Float>) View.ALPHA, tk4Var.getAlpha(), 0.0f);
                    ofFloat3.addListener(new c39(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ofa
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b4 = b;
                            sea seaVar2 = seaVar;
                            switch (b4) {
                                case 0:
                                    if (seaVar2.c1()) {
                                        seaVar2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (seaVar2.c1()) {
                                        seaVar2.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    if (seaVar2.c1()) {
                                        seaVar2.invalidate();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    ofFloat3.start();
                }
            }
        }
        animatorSet.start();
        return true;
    }
}
