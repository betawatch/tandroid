// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pda implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ sca a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ pi4 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ nfa e;

    public pda(nfa nfaVar, sca scaVar, SparseBooleanArray sparseBooleanArray, pi4 pi4Var, int i) {
        this.e = nfaVar;
        this.a = scaVar;
        this.b = sparseBooleanArray;
        this.c = pi4Var;
        this.d = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        nfa nfaVar = this.e;
        nfaVar.getViewTreeObserver().removeOnPreDrawListener(this);
        final sca scaVar = this.a;
        w39 adapter = scaVar.getAdapter();
        final byte b = 2;
        final byte b2 = 1;
        final byte b3 = 0;
        if (adapter == nfaVar.K || adapter == nfaVar.N || adapter == nfaVar.P || adapter == nfaVar.O) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = scaVar.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    int Q = nfa.Q(scaVar.getChildAt(i));
                    if (Q != 0 && sparseBooleanArray.get(Q, false)) {
                        nfaVar.S1.put(Q, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new j24(this, Q, scaVar));
                        ofFloat.addListener(new cn(this, Q, (byte) 12));
                        ofFloat.setStartDelay((int) ((Math.min(scaVar.getMeasuredHeight(), Math.max(0, r10.getTop())) / scaVar.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oda
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b4 = b3;
                                sca scaVar2 = scaVar;
                                switch (b4) {
                                    case 0:
                                        if (scaVar2.c1()) {
                                            scaVar2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (scaVar2.c1()) {
                                            scaVar2.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (scaVar2.c1()) {
                                            scaVar2.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    scaVar.invalidate();
                }
            }
            return true;
        }
        int childCount2 = scaVar.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt = scaVar.getChildAt(i2);
            pi4 pi4Var = this.c;
            if (childAt != pi4Var && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(scaVar.getMeasuredHeight(), Math.max(0, childAt.getTop())) / scaVar.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oda
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b4 = b2;
                        sca scaVar2 = scaVar;
                        switch (b4) {
                            case 0:
                                if (scaVar2.c1()) {
                                    scaVar2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                if (scaVar2.c1()) {
                                    scaVar2.invalidate();
                                    break;
                                }
                                break;
                            default:
                                if (scaVar2.c1()) {
                                    scaVar2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (pi4Var != null && pi4Var.getParent() == null) {
                scaVar.addView(pi4Var);
                d49 layoutManager = scaVar.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.L(pi4Var);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(pi4Var, (Property<pi4, Float>) View.ALPHA, pi4Var.getAlpha(), 0.0f);
                    ofFloat3.addListener(new ng9(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oda
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b4 = b;
                            sca scaVar2 = scaVar;
                            switch (b4) {
                                case 0:
                                    if (scaVar2.c1()) {
                                        scaVar2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (scaVar2.c1()) {
                                        scaVar2.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    if (scaVar2.c1()) {
                                        scaVar2.invalidate();
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
