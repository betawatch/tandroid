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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sea extends dha {
    public float v3;
    public float w3;
    public final /* synthetic */ pea x3;
    public final /* synthetic */ qea y3;
    public final /* synthetic */ nha z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sea(nha nhaVar, Context context, ylb ylbVar, pea peaVar, qea qeaVar) {
        super(context, ylbVar);
        this.z3 = nhaVar;
        this.x3 = peaVar;
        this.y3 = qeaVar;
    }

    @Override // dha
    public final boolean A1() {
        return this.z3.r1;
    }

    @Override // dha
    public final boolean B1() {
        return nha.j0(this.z3.s1);
    }

    @Override // dha
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
            fc4.g(e, true);
            return null;
        }
    }

    @Override // r59
    public final Integer W0(int i) {
        y59 adapter = getAdapter();
        zfa zfaVar = this.z3.T;
        if (adapter == zfaVar && zfaVar.e > 0 && i == zfaVar.d.size() - 1) {
            return 0;
        }
        return super.W0(i);
    }

    @Override // dha, r59, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        y59 adapter = getAdapter();
        nha nhaVar = this.z3;
        d dVar = nhaVar.y1;
        xfa xfaVar = nhaVar.f0;
        jea jeaVar = nhaVar.h0;
        pea peaVar = this.x3;
        if ((adapter == jeaVar || getAdapter() == xfaVar) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (nhaVar.r1) {
                if (nhaVar.s1 == (getAdapter() == xfaVar ? 8 : 9) && peaVar.n.getChildCount() > 0 && (childAt2 = peaVar.n.getChildAt(0)) != null) {
                    peaVar.n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = gm.U1(nhaVar.q1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != xfaVar && getMeasuredWidth() > gm.L(60.0f)) {
                if (this.o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.o3 = textPaint;
                    textPaint.setTextSize(gm.L(14.0f));
                    this.o3.setColor(cmb.v0(cmb.y6, this.o2));
                }
                int measuredWidth = getMeasuredWidth() - gm.L(60.0f);
                StaticLayout staticLayout = this.p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.p3 = new StaticLayout(jb6.M0(nhaVar.k0() ? dVar != null && sd2.V(dVar.getMessagesController().L0(Long.valueOf(-nhaVar.m1))) ? 2131746366 : 2131746362 : 2131746361, null), this.o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.q3 = 0.0f;
                    this.r3 = measuredWidth;
                    for (int i = 0; i < this.p3.getLineCount(); i++) {
                        this.q3 = Math.max(this.q3, this.p3.getLineWidth(i));
                        this.r3 = Math.min(this.r3, this.p3.getLineLeft(i));
                    }
                }
                canvas.save();
                hg9.m(this.p3.getHeight() + gm.L(64.0f), 2.0f, top, ((getWidth() - this.q3) / 2.0f) - this.r3, canvas);
                this.p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (peaVar.K) {
            float f = peaVar.L + 0.010666667f;
            peaVar.L = f;
            if (f >= 1.0f) {
                peaVar.L = 0.0f;
                peaVar.K = false;
                peaVar.J = 0;
            }
            invalidate();
        }
        j9c j9cVar = this.s3;
        if (j9cVar == null) {
            int currentAccount = dVar.getCurrentAccount();
            j9c[] j9cVarArr = j9c.f;
            if (j9cVarArr[currentAccount] == null) {
                j9cVarArr[currentAccount] = new j9c(currentAccount);
            }
            j9cVar = j9cVarArr[currentAccount];
            this.s3 = j9cVar;
        }
        j9cVar.a(this);
        if (nhaVar.r1) {
            return;
        }
        nhaVar.s1 = -1;
    }

    @Override // r59, android.view.ViewGroup, android.view.View
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

    @Override // dha
    public final int getAnimateToColumnsCount() {
        return this.z3.t1;
    }

    @Override // dha
    public final float getChangeColumnsProgress() {
        return this.z3.q1;
    }

    @Override // dha
    public final int getColumnsCount() {
        nha nhaVar = this.z3;
        boolean j0 = nha.j0(nhaVar.s1);
        int[] iArr = nhaVar.p1;
        return j0 ? iArr[1] : iArr[0];
    }

    @Override // dha
    public final SparseArray getMessageAlphaEnter() {
        return this.z3.S1;
    }

    @Override // dha
    public final z49 getMovingAdapter() {
        nha nhaVar = this.z3;
        return nha.j0(nhaVar.s1) ? nhaVar.v1(nhaVar.s1) : nhaVar.K;
    }

    @Override // dha
    public final z49 getSupportingAdapter() {
        nha nhaVar = this.z3;
        return nha.j0(nhaVar.s1) ? nhaVar.w1(nhaVar.s1) : nhaVar.L;
    }

    @Override // dha
    public final hga getSupportingListView() {
        return this.x3.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        d dVar;
        boolean z = this.J1;
        nha nhaVar = this.z3;
        if (z && nhaVar.getSelectedTab() == 11 && (dVar = nhaVar.y1) != null) {
            gm.t1(dVar.getParentActivity().getCurrentFocus());
        }
        nhaVar.C();
        y59 adapter = getAdapter();
        wga wgaVar = nhaVar.Q;
        if (adapter == wgaVar) {
            ArrayList arrayList = wgaVar.h;
            arrayList.clear();
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof rc2) {
                    arrayList.add(((rc2) childAt).getMessageObject());
                }
            }
            oc7.r1(wgaVar.d).i(arrayList, wgaVar.s.m1);
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        pea peaVar = this.x3;
        this.z3.z(peaVar, peaVar.h, this.y3);
        if (peaVar.F == 0) {
            PhotoViewer.r0().r();
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
            fc4.g(e, true);
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

    @Override // dha
    public final void z1(sha shaVar) {
        int messageId = shaVar.getMessageId();
        pea peaVar = this.x3;
        if (messageId != peaVar.J || !shaVar.c.B()) {
            shaVar.setHighlightProgress(0.0f);
            return;
        }
        if (!peaVar.K) {
            peaVar.L = 0.0f;
            peaVar.K = true;
        }
        float f = peaVar.L;
        shaVar.setHighlightProgress(f < 0.3f ? f / 0.3f : f > 0.7f ? (1.0f - f) / 0.3f : 1.0f);
    }
}
