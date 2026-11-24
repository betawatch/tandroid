// default package

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x62 extends a22 {
    public static final HashMap V = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public u62 K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public Drawable O;
    public ViewPropertyAnimator P;
    public ChatAttachAlertPhotoLayout Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public ylb n;
    public fv r;
    public u46 s;
    public w62 w;
    public UndoView x;
    public TextView y;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    @Override // a22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i, int i2) {
        int i3;
        int L;
        float f;
        fv fvVar = this.r;
        this.T = true;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        if (!gm.O1()) {
            Point point = gm.q;
            if (point.x > point.y) {
                i3 = (int) (i2 / 3.5f);
                this.S = i3;
                L = i3 - gm.L(52.0f);
                this.S = L;
                if (L < 0) {
                    this.S = 0;
                }
                if (fvVar.getPaddingTop() == this.S || fvVar.getPaddingBottom() != this.e) {
                    fvVar.q1(fvVar.getPaddingLeft(), this.S, fvVar.getPaddingRight(), this.e);
                    invalidate();
                }
                TextView textView = this.y;
                if (!gm.O1()) {
                    Point point2 = gm.q;
                    if (point2.x > point2.y) {
                        f = 18.0f;
                        textView.setTextSize(f);
                        this.T = false;
                    }
                }
                f = 20.0f;
                textView.setTextSize(f);
                this.T = false;
            }
        }
        i3 = (i2 / 5) << 1;
        this.S = i3;
        L = i3 - gm.L(52.0f);
        this.S = L;
        if (L < 0) {
        }
        if (fvVar.getPaddingTop() == this.S) {
        }
        fvVar.q1(fvVar.getPaddingLeft(), this.S, fvVar.getPaddingRight(), this.e);
        invalidate();
        TextView textView2 = this.y;
        if (!gm.O1()) {
        }
        f = 20.0f;
        textView2.setTextSize(f);
        this.T = false;
    }

    @Override // a22
    public final void E(int i) {
        i22 i22Var = this.b;
        if (i > 1) {
            i22Var.X2.S(0);
        } else {
            i22Var.X2.u(0);
        }
    }

    @Override // a22
    public final void H(a22 a22Var) {
        w62 w62Var = this.w;
        this.R = true;
        if (a22Var instanceof ChatAttachAlertPhotoLayout) {
            this.Q = (ChatAttachAlertPhotoLayout) a22Var;
            w62Var.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
            w62Var.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            w62Var.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            w62Var.c();
            w62Var.requestLayout();
            this.s.g1(0, 0);
            this.r.post(new lx1(this, a22Var, (byte) 22));
            postDelayed(new fo1(this, (byte) 23), 250L);
            w62Var.i(this.Q, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(1.0f).setDuration(150L).setInterpolator(d53.f);
        this.P = interpolator;
        interpolator.start();
    }

    @Override // a22
    public final void J() {
        this.r.z0(0);
    }

    @Override // a22
    public final boolean M() {
        return true;
    }

    public final void O() {
        ArrayList arrayList = this.w.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((v62) obj).h;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                u62 u62Var = (u62) obj2;
                RectF b = u62Var.b();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(b.width())), Math.max(1, Math.round(b.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-b.left, -b.top);
                u62Var.a(canvas, false);
                canvas.restore();
                Bitmap bitmap = u62Var.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    u62Var.v.recycle();
                }
                u62Var.v = createBitmap;
                u62Var.w = 0.0f;
                u62Var.O.z.invalidate();
            }
        }
    }

    @Override // a22
    public final void a(Editable editable) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(editable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable l;
        int i;
        wv1 wv1Var = this.b.s1;
        boolean z = false;
        if (wv1Var != null && (l = wv1Var.l()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (gm.O1()) {
                i = 16;
            } else {
                Point point = gm.q;
                i = point.x > point.y ? 6 : 12;
            }
            if (currentItemTop < a.getCurrentActionBarHeight()) {
                currentItemTop -= gm.L((1.0f - (currentItemTop / a.getCurrentActionBarHeight())) * i);
            }
            int max = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, max, getWidth(), getHeight());
            l.setBounds(0, max, getWidth(), gm.q.y + max);
            l.draw(canvas);
            z = true;
        }
        super.dispatchDraw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    @Override // a22
    public int getCurrentItemTop() {
        fv fvVar = this.r;
        if (fvVar.getChildCount() <= 0) {
            fvVar.setTopGlowOffset(fvVar.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = fvVar.getChildAt(0);
        b59 b59Var = (b59) fvVar.G(childAt);
        int top = childAt.getTop();
        int L = gm.L(8.0f);
        if (top < gm.L(8.0f) || b59Var == null || b59Var.b() != 0) {
            top = L;
        }
        fvVar.setTopGlowOffset(top);
        return top;
    }

    @Override // a22
    public int getFirstOffset() {
        return gm.L(56.0f) + getListTopPadding();
    }

    @Override // a22
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = gm.q;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // a22
    public int getSelectedItemsCount() {
        r62 r62Var;
        ArrayList arrayList;
        ArrayList arrayList2 = this.w.b;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            v62 v62Var = (v62) arrayList2.get(i2);
            if (v62Var != null && (r62Var = v62Var.k) != null && (arrayList = (ArrayList) r62Var.f) != null) {
                i = arrayList.size() + i;
            }
        }
        return i;
    }

    @Override // a22
    public final int j() {
        return 1;
    }

    @Override // a22
    public final boolean k() {
        this.b.J1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        w62 w62Var = this.w;
        super.onLayout(z, i, i2, i3, i4);
        Point point = gm.q;
        boolean z2 = point.y > point.x;
        if (this.U != z2) {
            this.U = z2;
            int size = w62Var.b.size();
            for (int i5 = 0; i5 < size; i5++) {
                v62 v62Var = (v62) w62Var.b.get(i5);
                if (((ArrayList) v62Var.k.f).size() == 1) {
                    v62Var.b(v62Var.k, true);
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T) {
            return;
        }
        super.requestLayout();
    }

    @Override // a22
    public final void t() {
        jo6 jo6Var;
        this.K = null;
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.w.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((v62) obj).h;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                u62 u62Var = (u62) obj2;
                if (u62Var.e && (jo6Var = u62Var.b) != null) {
                    jo6Var.R = false;
                }
            }
        }
    }

    @Override // a22
    public final void u() {
        i22 i22Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.R = false;
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(d53.j);
        this.P = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (i22Var = this.b).d2) != null) {
            chatAttachAlertPhotoLayout.d1.setIcon(R.drawable.msg_view_file);
            i22Var.d2.d1.setText(jb6.M0(2131753922, null));
            i22Var.d2.d1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.w.i(this.Q, true);
    }

    @Override // a22
    public final void w(int i) {
        try {
            this.b.d2.w(i);
        } catch (Exception unused) {
        }
    }
}
