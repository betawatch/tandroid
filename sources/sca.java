// default package

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sca extends dfa {
    public float v3;
    public float w3;
    public final /* synthetic */ pca x3;
    public final /* synthetic */ qca y3;
    public final /* synthetic */ nfa z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sca(nfa nfaVar, Context context, wjb wjbVar, pca pcaVar, qca qcaVar) {
        super(context, wjbVar);
        this.z3 = nfaVar;
        this.x3 = pcaVar;
        this.y3 = qcaVar;
    }

    @Override // dfa
    public final boolean A1() {
        return this.z3.r1;
    }

    @Override // dfa
    public final boolean B1() {
        return nfa.j0(this.z3.s1);
    }

    @Override // dfa
    public final boolean C1() {
        return this == this.x3.h;
    }

    public final View D1() {
        try {
            for (Object parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                if (parent != this && (parent instanceof RecyclerView)) {
                    return (View) parent;
                }
            }
            return null;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    @Override // o39
    public final Integer W0(int i) {
        w39 adapter = getAdapter();
        zda zdaVar = this.z3.T;
        if (adapter == zdaVar && zdaVar.e > 0 && i == zdaVar.d.size() - 1) {
            return 0;
        }
        return super.W0(i);
    }

    @Override // dfa, o39, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        w39 adapter = getAdapter();
        nfa nfaVar = this.z3;
        d dVar = nfaVar.y1;
        xda xdaVar = nfaVar.f0;
        jca jcaVar = nfaVar.h0;
        pca pcaVar = this.x3;
        if ((adapter == jcaVar || getAdapter() == xdaVar) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (nfaVar.r1) {
                if (nfaVar.s1 == (getAdapter() == xdaVar ? 8 : 9) && pcaVar.n.getChildCount() > 0 && (childAt2 = pcaVar.n.getChildAt(0)) != null) {
                    pcaVar.n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = gl.U1(nfaVar.q1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != xdaVar && getMeasuredWidth() > gl.L(60.0f)) {
                if (this.o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.o3 = textPaint;
                    textPaint.setTextSize(gl.L(14.0f));
                    this.o3.setColor(bkb.v0(bkb.y6, this.o2));
                }
                int measuredWidth = getMeasuredWidth() - gl.L(60.0f);
                StaticLayout staticLayout = this.p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.p3 = new StaticLayout(k96.M0(nfaVar.k0() ? dVar != null && hc2.V(dVar.getMessagesController().K0(Long.valueOf(-nfaVar.m1))) ? 2131746440 : 2131746436 : 2131746435, null), this.o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.q3 = 0.0f;
                    this.r3 = measuredWidth;
                    for (int i = 0; i < this.p3.getLineCount(); i++) {
                        this.q3 = Math.max(this.q3, this.p3.getLineWidth(i));
                        this.r3 = Math.min(this.r3, this.p3.getLineLeft(i));
                    }
                }
                canvas.save();
                de9.n(this.p3.getHeight() + gl.L(64.0f), 2.0f, top, ((getWidth() - this.q3) / 2.0f) - this.r3, canvas);
                this.p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (pcaVar.K) {
            float f = pcaVar.L + 0.010666667f;
            pcaVar.L = f;
            if (f >= 1.0f) {
                pcaVar.L = 0.0f;
                pcaVar.K = false;
                pcaVar.J = 0;
            }
            invalidate();
        }
        i7c i7cVar = this.s3;
        if (i7cVar == null) {
            int currentAccount = dVar.getCurrentAccount();
            i7c[] i7cVarArr = i7c.f;
            if (i7cVarArr[currentAccount] == null) {
                i7cVarArr[currentAccount] = new i7c(currentAccount);
            }
            i7cVar = i7cVarArr[currentAccount];
            this.s3 = i7cVar;
        }
        i7cVar.a(this);
        if (nfaVar.r1) {
            return;
        }
        nfaVar.s1 = -1;
    }

    @Override // o39, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d dVar = this.z3.y1;
        if (dVar == null || !dVar.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.v3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            dVar.finishPreviewFragment();
            return true;
        }
        if (motionEvent.getAction() == 2) {
            float f = this.w3 - this.v3;
            dVar.movePreviewFragment(f);
            if (f < 0.0f) {
                this.w3 = this.v3;
            }
        }
        return true;
    }

    @Override // dfa
    public final int getAnimateToColumnsCount() {
        return this.z3.t1;
    }

    @Override // dfa
    public final float getChangeColumnsProgress() {
        return this.z3.q1;
    }

    @Override // dfa
    public final int getColumnsCount() {
        nfa nfaVar = this.z3;
        boolean j0 = nfa.j0(nfaVar.s1);
        int[] iArr = nfaVar.p1;
        return j0 ? iArr[1] : iArr[0];
    }

    @Override // dfa
    public final SparseArray getMessageAlphaEnter() {
        return this.z3.S1;
    }

    @Override // dfa
    public final w29 getMovingAdapter() {
        nfa nfaVar = this.z3;
        return nfa.j0(nfaVar.s1) ? nfaVar.v1(nfaVar.s1) : nfaVar.K;
    }

    @Override // dfa
    public final w29 getSupportingAdapter() {
        nfa nfaVar = this.z3;
        return nfa.j0(nfaVar.s1) ? nfaVar.w1(nfaVar.s1) : nfaVar.L;
    }

    @Override // dfa
    public final hea getSupportingListView() {
        return this.x3.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        d dVar;
        boolean z = this.J1;
        nfa nfaVar = this.z3;
        if (z && nfaVar.getSelectedTab() == 11 && (dVar = nfaVar.y1) != null) {
            gl.t1(dVar.getParentActivity().getCurrentFocus());
        }
        nfaVar.C();
        w39 adapter = getAdapter();
        wea weaVar = nfaVar.Q;
        if (adapter == weaVar) {
            ArrayList arrayList = weaVar.h;
            arrayList.clear();
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof gb2) {
                    arrayList.add(((gb2) childAt).getMessageObject());
                }
            }
            na7.q1(weaVar.d).i(arrayList, weaVar.s.m1);
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        pca pcaVar = this.x3;
        this.z3.z(pcaVar, pcaVar.h, this.y3);
        if (pcaVar.F == 0) {
            PhotoViewer.r0().t();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        if (r2.performAccessibilityAction(r4, r5) != false) goto L26;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        try {
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (i == 4096) {
            View D1 = D1();
            if (D1 != null && D1.canScrollVertically(1) && D1.performAccessibilityAction(i, bundle)) {
            }
            return super.performAccessibilityAction(i, bundle);
        }
        if (i == 8192) {
            if (!canScrollVertically(-1)) {
                View D12 = D1();
                if (D12 != null) {
                    if (D12.canScrollVertically(-1)) {
                    }
                }
            }
        }
        return super.performAccessibilityAction(i, bundle);
        return true;
    }

    @Override // dfa
    public final void z1(qfa qfaVar) {
        int messageId = qfaVar.getMessageId();
        pca pcaVar = this.x3;
        if (messageId != pcaVar.J || !qfaVar.c.B()) {
            qfaVar.setHighlightProgress(0.0f);
            return;
        }
        if (!pcaVar.K) {
            pcaVar.L = 0.0f;
            pcaVar.K = true;
        }
        float f = pcaVar.L;
        qfaVar.setHighlightProgress(f < 0.3f ? f / 0.3f : f > 0.7f ? (1.0f - f) / 0.3f : 1.0f);
    }
}
