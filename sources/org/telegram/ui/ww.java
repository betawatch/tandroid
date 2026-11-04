package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ww extends View implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public int F;
    public final Paint a;
    public final Paint b;
    public final int c;
    public final ArrayList d;
    public float e;
    public float f;
    public float h;
    public final ImageReceiver n;
    public final ImageReceiver r;
    public final org.telegram.ui.Components.ch0 s;
    public final org.telegram.ui.Components.ch0 w;
    public boolean x;
    public int y;

    public ww(Context context, int i3) {
        super(context);
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.r = imageReceiver2;
        this.c = i3;
        imageReceiver.y = true;
        imageReceiver2.y = true;
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(R.raw.download_progress, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.s = ch0Var;
        org.telegram.ui.Components.ch0 ch0Var2 = new org.telegram.ui.Components.ch0(R.raw.download_finish, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.w = ch0Var2;
        imageReceiver.w0(ch0Var);
        imageReceiver2.w0(ch0Var2);
        imageReceiver.W(1);
        ch0Var.K(1);
        ch0Var.start();
    }

    public final void a() {
        ArrayList arrayList;
        int i3 = this.c;
        ArrayList arrayList2 = org.telegram.messenger.z5.q(i3).H;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            hashMap.put(((vw) arrayList.get(i10)).c, (vw) arrayList.get(i10));
            org.telegram.messenger.z5.q(i3).v((org.telegram.messenger.x5) arrayList.get(i10));
            i10++;
        }
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            String S0 = ((org.telegram.messenger.zi) arrayList2.get(i11)).S0();
            if (org.telegram.messenger.w7.G(i3).T(S0)) {
                vw vwVar = (vw) hashMap.get(S0);
                if (vwVar == null) {
                    vwVar = new vw(this, S0);
                }
                org.telegram.messenger.z5.q(i3).a(S0, null, vwVar);
                arrayList.add(vwVar);
            }
        }
        if (arrayList.size() != 0 || this.E) {
            return;
        }
        if (org.telegram.messenger.z5.q(i3).J.size() > 0) {
            this.e = 1.0f;
            this.f = 1.0f;
            this.x = true;
        } else {
            this.e = 0.0f;
            this.f = 0.0f;
            this.x = false;
        }
    }

    public final void b() {
        org.telegram.messenger.qr.a0(this.c);
        int i3 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 >= arrayList.size()) {
                break;
            }
            j10 += ((vw) arrayList.get(i3)).a;
            j11 += ((vw) arrayList.get(i3)).b;
            i3++;
        }
        if (j10 == 0) {
            this.e = 1.0f;
        } else {
            this.e = j11 / j10;
        }
        float f10 = this.e;
        if (f10 > 1.0f) {
            this.e = 1.0f;
        } else if (f10 < 0.0f) {
            this.e = 0.0f;
        }
        this.h = ((this.e - this.f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.b5) {
            a();
            b();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.hs.f(this.c).c(this, org.telegram.messenger.hs.b5);
        this.n.P();
        this.r.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i10 = this.c;
            if (i3 >= size) {
                arrayList.clear();
                org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.b5);
                this.n.R();
                this.r.R();
                return;
            }
            org.telegram.messenger.z5.q(i10).v((org.telegram.messenger.x5) arrayList.get(i3));
            i3++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() == 0.0f) {
            return;
        }
        int i3 = this.y;
        int i10 = org.telegram.ui.ActionBar.k6.v8;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        ImageReceiver imageReceiver = this.r;
        ImageReceiver imageReceiver2 = this.n;
        Paint paint = this.a;
        Paint paint2 = this.b;
        if (i3 != x02) {
            this.y = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageReceiver2.p1 = new PorterDuffColorFilter(x03, mode);
            imageReceiver.p1 = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, i10, false), mode);
            paint2.setAlpha(100);
        }
        float f10 = this.f;
        float f11 = this.e;
        if (f10 != f11) {
            float f12 = this.h;
            float f13 = f10 + f12;
            this.f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f = f11;
            } else if (f12 >= 0.0f || f13 >= f11) {
                invalidate();
            } else {
                this.f = f11;
            }
        }
        int L = org.telegram.messenger.g0.L(8.0f) + (getMeasuredHeight() / 2);
        float L2 = org.telegram.messenger.g0.L(1.0f);
        float L3 = org.telegram.messenger.g0.L(16.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        float f14 = L;
        float f15 = f14 - L2;
        float f16 = f14 + L2;
        rectF.set(L3, f15, getMeasuredWidth() - L3, f16);
        canvas.drawRoundRect(rectF, L2, L2, paint2);
        rectF.set(L3, f15, ((getMeasuredWidth() - (2.0f * L3)) * this.f) + L3, f16);
        canvas.drawRoundRect(rectF, L2, L2, paint);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f15);
        if (this.e != 1.0f) {
            this.x = false;
        }
        if (this.x) {
            imageReceiver.h(canvas, null);
        } else {
            imageReceiver2.h(canvas, null);
        }
        if (this.e == 1.0f && !this.x && this.s.b0 == 0) {
            org.telegram.ui.Components.ch0 ch0Var = this.w;
            ch0Var.N(0, false, false);
            ch0Var.start();
            this.x = true;
        }
        canvas.restore();
        if (getAlpha() != 0.0f) {
            this.E = true;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
        int L = org.telegram.messenger.g0.L(15.0f);
        float f10 = L;
        int i11 = L * 2;
        this.n.y0(f10, f10, getMeasuredWidth() - i11, getMeasuredHeight() - i11);
        this.r.y0(f10, f10, getMeasuredWidth() - i11, getMeasuredHeight() - i11);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        if (f10 == 0.0f) {
            this.E = false;
        }
        super.setAlpha(f10);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        if (i3 != 0) {
            this.E = false;
        }
        super.setVisibility(i3);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.Components.ch0 ch0Var;
        org.telegram.ui.Components.ch0 ch0Var2 = this.s;
        if (ch0Var2 == null || (ch0Var = this.w) == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.v8, false);
        if (x02 != this.F || ch0Var2.getColorFilter() == null) {
            this.F = x02;
            ch0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            ch0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC));
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
