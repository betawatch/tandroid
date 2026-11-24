// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w62 extends ViewGroup {
    public long E;
    public v62 F;
    public u62 G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final PointF L;
    public boolean M;
    public final o1 N;
    public final t62 O;
    public int P;
    public final /* synthetic */ x62 Q;
    public final cm1 a;
    public final ArrayList b;
    public final HashMap c;
    public HashMap d;
    public ArrayList e;
    public HashMap f;
    public ArrayList h;
    public final int n;
    public final int r;
    public int s;
    public float w;
    public float x;
    public boolean[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w62(x62 x62Var, Context context) {
        super(context);
        this.Q = x62Var;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.n = gm.L(16.0f);
        this.r = gm.L(64.0f);
        this.s = 0;
        this.y = null;
        this.E = 0L;
        this.F = null;
        this.G = null;
        this.H = 0.0f;
        this.L = new PointF();
        this.M = false;
        this.N = new o1(this, (byte) 16);
        this.O = new t62(this);
        this.P = 0;
        setWillNotDraw(false);
        cm1 cm1Var = new cm1(x62Var.n, context, true);
        this.a = cm1Var;
        cm1Var.setCustomText(jb6.M0(2131753925, null));
        addView(cm1Var);
    }

    public final void a() {
        String str;
        this.d = this.Q.Q.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) ((v62) arrayList.get(i)).k.f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    jo6 jo6Var = (jo6) arrayList2.get(i2);
                    HashMap hashMap = this.c;
                    if (hashMap.containsKey(jo6Var)) {
                        Object obj = hashMap.get(jo6Var);
                        this.f.put(obj, jo6Var);
                        this.h.add(obj);
                    } else {
                        int i3 = 0;
                        while (true) {
                            if (i3 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i3);
                                Object value = entry.getValue();
                                if (value == jo6Var) {
                                    Object key = entry.getKey();
                                    this.f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 0;
                                while (true) {
                                    if (i4 < this.e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.e.get(i4);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof jo6) && (str = ((jo6) value2).I) != null && jo6Var != null && str.equals(jo6Var.I)) {
                                            Object key2 = entry2.getKey();
                                            this.f.put(key2, value2);
                                            this.h.add(key2);
                                            break;
                                        }
                                        i4++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final PointF b() {
        x62 x62Var = this.Q;
        u62 u62Var = x62Var.K;
        PointF pointF = this.L;
        if (u62Var == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (x62Var.L) {
            RectF e = u62Var.e(u62Var.c());
            RectF e2 = x62Var.K.e(1.0f);
            pointF.x = gm.R1((e.width() / 2.0f) + e2.left, this.I, this.H / this.K);
            pointF.y = gm.R1((e.height() / 2.0f) + x62Var.K.a.a + e2.top, this.J, this.H / this.K);
            return pointF;
        }
        RectF e3 = u62Var.e(u62Var.c());
        RectF e4 = x62Var.K.e(1.0f);
        pointF.x = gm.R1((e3.width() / 2.0f) + e4.left, x62Var.E - ((x62Var.H - 0.5f) * x62Var.I), this.H);
        pointF.y = gm.R1((e3.height() / 2.0f) + x62Var.K.a.a + e4.top, (x62Var.F - ((x62Var.G - 0.5f) * x62Var.J)) + x62Var.N, this.H);
        return pointF;
    }

    public final void c() {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((v62) arrayList.get(i)).h;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                u62 u62Var = (u62) arrayList2.get(i2);
                qna qnaVar = u62Var.s;
                if (qnaVar != null) {
                    qnaVar.b(u62Var.O.z);
                    u62Var.s = null;
                }
            }
            i++;
        }
        arrayList.clear();
        ArrayList arrayList3 = new ArrayList();
        int size = this.h.size();
        int i3 = size - 1;
        for (int i4 = 0; i4 < size; i4++) {
            Integer num = (Integer) this.h.get(i4);
            num.getClass();
            arrayList3.add((jo6) this.d.get(num));
            if (i4 % 10 == 9 || i4 == i3) {
                v62 v62Var = new v62(this);
                v62Var.b(new r62(this.Q, arrayList3), false);
                arrayList.add(v62Var);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        ArrayList arrayList = this.b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f = this.n;
        int computeVerticalScrollOffset = this.Q.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - r3.getListTopPadding());
        this.x = (r4.getMeasuredHeight() - r3.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            float a = ((v62) arrayList.get(i)).a() + f;
            float f2 = this.w;
            zArr[i] = (f >= f2 && f <= this.x) || (a >= f2 && a <= this.x) || (f <= f2 && a >= this.x);
            i++;
            f = a;
        }
        return zArr;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public final int e() {
        int i = this.n + this.r;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = (int) (((v62) arrayList.get(i2)).a() + i);
        }
        cm1 cm1Var = this.a;
        if (cm1Var.getMeasuredHeight() <= 0) {
            cm1Var.measure(View.MeasureSpec.makeMeasureSpec(gm.q.x, TLObject.FLAG_30), -2147473649);
        }
        return cm1Var.getMeasuredHeight() + i;
    }

    public final void f(v62 v62Var, jo6 jo6Var, int i) {
        ArrayList arrayList = (ArrayList) v62Var.k.f;
        arrayList.add(Math.min(arrayList.size(), i), jo6Var);
        if (((ArrayList) v62Var.k.f).size() == 11) {
            jo6 jo6Var2 = (jo6) ((ArrayList) v62Var.k.f).get(10);
            ((ArrayList) v62Var.k.f).remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(v62Var);
            if (indexOf >= 0) {
                int i2 = indexOf + 1;
                v62 v62Var2 = i2 == arrayList2.size() ? null : (v62) arrayList2.get(i2);
                if (v62Var2 == null) {
                    v62 v62Var3 = new v62(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(jo6Var2);
                    v62Var3.b(new r62(this.Q, arrayList3), true);
                    invalidate();
                } else {
                    f(v62Var2, jo6Var2, 0);
                }
            }
        }
        v62Var.b(v62Var.k, true);
    }

    public final void g() {
        float f = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            v62 v62Var = (v62) arrayList.get(i2);
            float a = v62Var.a();
            v62Var.a = f;
            v62Var.b = i;
            f += a;
            i += ((ArrayList) v62Var.k.f).size();
        }
    }

    public final void h() {
        x62 x62Var = this.Q;
        ValueAnimator valueAnimator = x62Var.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b = b();
        float f = this.H;
        this.K = f;
        this.I = b.x;
        this.J = b.y;
        x62Var.L = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
        x62Var.M = ofFloat;
        ofFloat.addUpdateListener(new s62(this, (byte) 1));
        x62Var.M.addListener(new b91((Object) this, (byte) 20));
        x62Var.M.setDuration(200L);
        x62Var.M.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        p62 p62Var = chatAttachAlertPhotoLayout.H;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        d62 d62Var = chatAttachAlertPhotoLayout.F;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.t1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.u1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z) {
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.z0();
            int childCount = d62Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = d62Var.getChildAt(i);
                if (childAt instanceof q68) {
                    int R = RecyclerView.R(childAt);
                    boolean z2 = p62Var.f;
                    boolean z3 = p62Var.d;
                    if (z2 && R > chatAttachAlertPhotoLayout.N0) {
                        R--;
                    }
                    if (z3 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        R--;
                    }
                    q68 q68Var = (q68) childAt;
                    if (i22Var.N2 != 0 || i22Var.B1) {
                        q68Var.getCheckBox().setVisibility(8);
                    }
                    jo6 d0 = chatAttachAlertPhotoLayout.d0(R);
                    if (d0 != null) {
                        int i2 = d0.C;
                        q68Var.d(d0, hashMap2.size() > 1, z3 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0, R == p62Var.b() - 1, i22Var.c2);
                        if ((i22Var.Z1 instanceof yv1) && i22Var.Q3) {
                            q68Var.b(arrayList2.indexOf(Integer.valueOf(i2)), hashMap2.containsKey(Integer.valueOf(i2)), false);
                        } else {
                            q68Var.b(-1, hashMap2.containsKey(Integer.valueOf(i2)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.Q.b.F1(1);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int c = b10.c(45.0f, gm.q.y - a.getCurrentActionBarHeight(), e());
        if (this.s != c) {
            this.s = c;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v62 v62Var = (v62) arrayList.get(i);
            if (((ArrayList) v62Var.k.f).size() < 10 && i < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) v62Var.k.f).size();
                v62 v62Var2 = (v62) arrayList.get(i + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) v62Var2.k.f).size());
                for (int i2 = 0; i2 < min; i2++) {
                    arrayList2.add((jo6) ((ArrayList) v62Var2.k.f).remove(0));
                }
                ((ArrayList) v62Var.k.f).addAll(arrayList2);
                v62Var.b(v62Var.k, true);
                v62Var2.b(v62Var2.k, true);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        float f2;
        u62 u62Var;
        float f3 = this.n;
        x62 x62Var = this.Q;
        int computeVerticalScrollOffset = x62Var.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - x62Var.getListTopPadding());
        this.x = (r2.getMeasuredHeight() - x62Var.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f3);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f4 = f3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            v62 v62Var = (v62) arrayList2.get(i4);
            float a = v62Var.a();
            v62Var.a = f4;
            v62Var.b = i5;
            float f5 = this.w;
            if (f4 < f5 || f4 > this.x) {
                float f6 = f4 + a;
                if ((f6 < f5 || f6 > this.x) && (f4 > f5 || f6 < this.x)) {
                    f = a;
                    arrayList = arrayList2;
                    i = size;
                    i2 = i4;
                    i3 = i5;
                    canvas.translate(0.0f, f);
                    f4 += f;
                    i5 = ((ArrayList) v62Var.k.f).size() + i3;
                    i4 = i2 + 1;
                    size = i;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = v62Var.h;
            int i6 = v62Var.l;
            m37 m37Var = v62Var.x;
            w62 w62Var = v62Var.z;
            arrayList = arrayList2;
            float interpolation = v62Var.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - v62Var.c) / 200.0f));
            boolean z = interpolation < 1.0f;
            Point point = gm.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float R1 = gm.R1(v62Var.f, v62Var.d, interpolation);
            int width = w62Var.getWidth();
            x62 x62Var2 = w62Var.Q;
            float previewScale = width * R1 * x62Var2.getPreviewScale();
            boolean z2 = z;
            float previewScale2 = x62Var2.getPreviewScale() * gm.R1(v62Var.g, v62Var.e, interpolation) * max;
            if (m37Var != null) {
                f2 = 2.0f;
                v62Var.p = 0.0f;
                float width2 = w62Var.getWidth();
                float f7 = i6;
                v62Var.n = (width2 - Math.max(f7, previewScale)) / 2.0f;
                v62Var.o = (Math.max(f7, previewScale) + w62Var.getWidth()) / 2.0f;
                v62Var.q = Math.max(i6 << 1, previewScale2);
                v62Var.x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                m37Var.setBounds((int) v62Var.n, (int) v62Var.p, (int) v62Var.o, (int) v62Var.q);
                m37Var.setAlpha((int) ((v62Var.d <= 0.0f ? 1.0f - interpolation : v62Var.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                m37Var.d(canvas, v62Var.y, null);
                v62Var.p += f7;
                v62Var.n += f7;
                v62Var.q -= f7;
                v62Var.o -= f7;
            } else {
                f2 = 2.0f;
            }
            v62Var.r = v62Var.o - v62Var.n;
            v62Var.s = v62Var.q - v62Var.p;
            int size2 = arrayList3.size();
            for (int i7 = 0; i7 < size2; i7++) {
                u62 u62Var2 = (u62) arrayList3.get(i7);
                if (u62Var2 != null && (((u62Var = x62Var2.K) == null || u62Var.b != u62Var2.b) && u62Var2.a(canvas, false))) {
                    z2 = true;
                }
            }
            Paint paint = v62Var.w;
            RectF rectF = v62Var.t;
            long j = v62Var.i;
            if (j <= 0) {
                i = size;
                i2 = i4;
                i3 = i5;
                f = a;
            } else {
                if (v62Var.u == null || v62Var.v != j) {
                    v62Var.v = j;
                    v62Var.u = new uib(nxa.b1(false, jb6.H(',', "UnlockPaidContent", (int) j), 0.7f, null), 14.0f, gm.o());
                }
                float L = gm.L(28.0f) + v62Var.u.c;
                float L2 = gm.L(32.0f);
                float f8 = v62Var.n;
                float f9 = v62Var.r;
                float f10 = f2;
                float z3 = aq1.z(f9, L, f10, f8);
                i = size;
                float f11 = v62Var.p;
                i2 = i4;
                float f12 = v62Var.s;
                i3 = i5;
                rectF.set(z3, aq1.z(f12, L2, f10, f11), td4.e(f9, L, f10, f8), td4.e(f12, L2, f10, f11));
                paint.setColor(1610612736);
                float f13 = L2 / f10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
                uib uibVar = v62Var.u;
                float L3 = gm.L(14.0f) + (((v62Var.r / f10) + v62Var.n) - (L / f10));
                float f14 = v62Var.p + (v62Var.s / f10);
                f = a;
                uibVar.c(L3, f14, 1.0f, -1, canvas);
            }
            if (z2) {
                invalidate();
            }
            canvas.translate(0.0f, f);
            f4 += f;
            i5 = ((ArrayList) v62Var.k.f).size() + i3;
            i4 = i2 + 1;
            size = i;
            arrayList2 = arrayList;
        }
        cm1 cm1Var = this.a;
        cm1Var.j0(f4, cm1Var.getMeasuredHeight());
        if (cm1Var.Q()) {
            cm1Var.F(canvas, true);
            cm1Var.I(canvas, true);
        }
        cm1Var.draw(canvas);
        canvas.restore();
        if (x62Var.K != null) {
            canvas.save();
            PointF b = b();
            canvas.translate(b.x, b.y);
            if (x62Var.K.a(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        cm1 cm1Var = this.a;
        cm1Var.layout(0, 0, cm1Var.getMeasuredWidth(), cm1Var.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.a.measure(i, -2147473649);
        if (this.s <= 0) {
            this.s = b10.c(45.0f, gm.q.y - a.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), this.s), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05da  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v62 v62Var;
        u62 u62Var;
        float f;
        v62 v62Var2;
        u62 u62Var2;
        int action;
        boolean z;
        int i;
        u62 u62Var3;
        int i2;
        yv1 yv1Var;
        u62 u62Var4;
        r62 r62Var;
        ArrayList arrayList;
        u62 u62Var5;
        ValueAnimator valueAnimator;
        r62 r62Var2;
        int i3;
        int i4;
        int i5;
        float f2;
        x62 x62Var = this.Q;
        i22 i22Var = x62Var.b;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i6 = 0;
        float f3 = 0.0f;
        while (true) {
            if (i6 >= size) {
                v62Var = null;
                break;
            }
            v62Var = (v62) arrayList2.get(i6);
            float a = v62Var.a();
            if (y >= f3 && y <= f3 + a) {
                break;
            }
            f3 += a;
            i6++;
        }
        if (v62Var != null) {
            ArrayList arrayList3 = v62Var.h;
            int size2 = arrayList3.size();
            for (int i7 = 0; i7 < size2; i7++) {
                u62Var = (u62) arrayList3.get(i7);
                if (u62Var != null && u62Var.b().contains(x, y - f3)) {
                    break;
                }
            }
        }
        u62Var = null;
        u62 u62Var6 = x62Var.K;
        if (u62Var6 != null) {
            RectF e = u62Var6.e(u62Var6.c());
            PointF b = b();
            RectF rectF = new RectF();
            float f4 = b.x;
            float f5 = b.y;
            f = 2.0f;
            rectF.set(f4 - (e.width() / 2.0f), f5 - (e.height() / 2.0f), (e.width() / 2.0f) + f4, (e.height() / 2.0f) + f5);
            int i8 = 0;
            v62Var2 = null;
            float f6 = 0.0f;
            float f7 = 0.0f;
            while (i8 < size) {
                v62 v62Var3 = (v62) arrayList2.get(i8);
                float a2 = v62Var3.a() + f6;
                int i9 = size;
                if (a2 >= rectF.top) {
                    float f8 = rectF.bottom;
                    if (f8 >= f6) {
                        float min = Math.min(a2, f8) - Math.max(f6, rectF.top);
                        if (min > f7) {
                            f7 = min;
                            v62Var2 = v62Var3;
                        }
                    }
                }
                i8++;
                f6 = a2;
                size = i9;
            }
            if (v62Var2 != null) {
                ArrayList arrayList4 = v62Var2.h;
                int size3 = arrayList4.size();
                int i10 = 0;
                u62Var2 = null;
                float f9 = 0.0f;
                while (i10 < size3) {
                    u62 u62Var7 = (u62) arrayList4.get(i10);
                    ArrayList arrayList5 = arrayList4;
                    if (u62Var7 == null || u62Var7 == x62Var.K) {
                        i3 = size3;
                    } else {
                        i3 = size3;
                        if (((ArrayList) v62Var2.k.f).contains(u62Var7.b)) {
                            RectF b2 = u62Var7.b();
                            int i11 = u62Var7.i;
                            if ((i11 & 4) > 0) {
                                i5 = i11;
                                f2 = 0.0f;
                                b2.top = 0.0f;
                            } else {
                                i5 = i11;
                                f2 = 0.0f;
                            }
                            if ((i5 & 1) > 0) {
                                b2.left = f2;
                            }
                            if ((i5 & 2) > 0) {
                                b2.right = getWidth();
                            }
                            if ((u62Var7.i & 8) > 0) {
                                b2.bottom = v62Var2.s;
                            }
                            if (RectF.intersects(rectF, b2)) {
                                i4 = i10;
                                float min2 = ((Math.min(b2.bottom, rectF.bottom) - Math.max(b2.top, rectF.top)) * (Math.min(b2.right, rectF.right) - Math.max(b2.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f9) {
                                    f9 = min2;
                                    u62Var2 = u62Var7;
                                }
                                i10 = i4 + 1;
                                arrayList4 = arrayList5;
                                size3 = i3;
                            }
                        }
                    }
                    i4 = i10;
                    i10 = i4 + 1;
                    arrayList4 = arrayList5;
                    size3 = i3;
                }
                action = motionEvent.getAction();
                o1 o1Var = this.N;
                if (action == 0 || x62Var.K != null || x62Var.r.J1 || (((valueAnimator = x62Var.M) != null && valueAnimator.isRunning()) || v62Var == null || u62Var == null || (r62Var2 = v62Var.k) == null || !((ArrayList) r62Var2.f).contains(u62Var.b))) {
                    if (action == 2 || x62Var.K == null || x62Var.L) {
                        if (action == 1) {
                            u62 u62Var8 = x62Var.K;
                            if (u62Var8 != null) {
                                if (v62Var == null || u62Var == null || u62Var == u62Var8) {
                                    if (v62Var2 == null || u62Var2 == null || u62Var2 == u62Var8 || u62Var2.b == u62Var8.b) {
                                        v62Var = null;
                                        u62Var = null;
                                    } else {
                                        v62Var = v62Var2;
                                        u62Var = u62Var2;
                                    }
                                }
                                if (v62Var != null) {
                                    ArrayList arrayList6 = v62Var.h;
                                    if (u62Var != null && u62Var != u62Var8) {
                                        int indexOf = ((ArrayList) u62Var8.a.k.f).indexOf(u62Var8.b);
                                        int indexOf2 = ((ArrayList) v62Var.k.f).indexOf(u62Var.b);
                                        if (indexOf >= 0) {
                                            ((ArrayList) x62Var.K.a.k.f).remove(indexOf);
                                            v62 v62Var4 = x62Var.K.a;
                                            v62Var4.b(v62Var4.k, true);
                                        }
                                        if (indexOf2 >= 0) {
                                            if (arrayList2.indexOf(v62Var) > arrayList2.indexOf(x62Var.K.a)) {
                                                indexOf2++;
                                            }
                                            f(v62Var, x62Var.K.b, indexOf2);
                                            if (x62Var.K.a != v62Var) {
                                                int size4 = arrayList6.size();
                                                int i12 = 0;
                                                while (true) {
                                                    if (i12 >= size4) {
                                                        u62Var5 = null;
                                                        break;
                                                    }
                                                    u62Var5 = (u62) arrayList6.get(i12);
                                                    if (u62Var5.b == x62Var.K.b) {
                                                        break;
                                                    }
                                                    i12++;
                                                }
                                                if (u62Var5 != null) {
                                                    g();
                                                    u62 u62Var9 = x62Var.K;
                                                    v62 v62Var5 = u62Var5.O;
                                                    float f10 = u62Var9.j;
                                                    RectF rectF2 = u62Var9.g;
                                                    u62Var5.j = gm.R1(f10, u62Var9.k, u62Var9.c());
                                                    if (u62Var5.f == null) {
                                                        u62Var5.f = new RectF();
                                                    }
                                                    RectF rectF3 = new RectF();
                                                    RectF rectF4 = u62Var5.f;
                                                    RectF rectF5 = u62Var5.g;
                                                    if (rectF4 == null) {
                                                        rectF3.set(rectF5);
                                                    } else {
                                                        gm.X1(rectF4, rectF5, u62Var5.c(), rectF3);
                                                    }
                                                    RectF rectF6 = u62Var9.f;
                                                    if (rectF6 != null) {
                                                        gm.X1(rectF6, rectF2, u62Var9.c(), u62Var5.f);
                                                        u62Var5.f.set(rectF3.centerX() - (((u62Var5.f.width() / f) * u62Var9.a.r) / v62Var5.r), rectF3.centerY() - (((u62Var5.f.height() / f) * u62Var9.a.s) / v62Var5.s), (((u62Var5.f.width() / f) * u62Var9.a.r) / v62Var5.r) + rectF3.centerX(), (((u62Var5.f.height() / f) * u62Var9.a.s) / v62Var5.s) + rectF3.centerY());
                                                    } else {
                                                        u62Var5.f.set(rectF3.centerX() - (((rectF2.width() / f) * u62Var9.a.r) / v62Var5.r), rectF3.centerY() - (((rectF2.height() / f) * u62Var9.a.s) / v62Var5.s), (((rectF2.width() / f) * u62Var9.a.r) / v62Var5.r) + rectF3.centerX(), (((rectF2.height() / f) * u62Var9.a.s) / v62Var5.s) + rectF3.centerY());
                                                    }
                                                    u62Var5.j = gm.R1(u62Var5.j, u62Var5.k, u62Var5.c());
                                                    u62Var5.h = SystemClock.elapsedRealtime();
                                                    x62Var.K = u62Var5;
                                                    u62Var5.a = v62Var;
                                                    u62Var5.j = 1.0f;
                                                    u62Var5.k = 1.0f;
                                                    g();
                                                }
                                            }
                                        }
                                        try {
                                            x62Var.performHapticFeedback(7, 2);
                                        } catch (Exception unused) {
                                        }
                                        j();
                                        i(x62Var.Q, false);
                                    }
                                }
                                h();
                            } else if (u62Var8 == null && (u62Var3 = this.G) != null && this.F != null) {
                                if (u62Var3.e && u62Var3.l == 0.0f) {
                                    float x2 = motionEvent.getX();
                                    float y2 = motionEvent.getY();
                                    u62Var3.m = x2;
                                    u62Var3.n = y2;
                                    RectF b3 = u62Var3.b();
                                    u62Var3.o = (float) Math.sqrt(Math.pow(b3.height(), 2.0d) + Math.pow(b3.width(), 2.0d));
                                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) pqe.a(u62Var3.o * 0.3f, 250.0f, 550.0f));
                                    duration.setInterpolator(d53.j);
                                    duration.addUpdateListener(new et1(u62Var3, (byte) 5));
                                    duration.addListener(new b91((Object) u62Var3, (byte) 21));
                                    duration.start();
                                } else {
                                    RectF b4 = u62Var3.b();
                                    RectF rectF7 = gm.P;
                                    float L = b4.right - gm.L(36.4f);
                                    float f11 = this.F.p + b4.top;
                                    rectF7.set(L, f11, b4.right, gm.L(36.4f) + f11);
                                    if (!rectF7.contains(x, y - this.G.a.a)) {
                                        a();
                                        ArrayList arrayList7 = new ArrayList();
                                        int size5 = arrayList2.size();
                                        for (int i13 = 0; i13 < size5; i13++) {
                                            v62 v62Var6 = (v62) arrayList2.get(i13);
                                            if (v62Var6 != null && (r62Var = v62Var6.k) != null && (arrayList = (ArrayList) r62Var.f) != null) {
                                                arrayList7.addAll(arrayList);
                                            }
                                        }
                                        int indexOf3 = arrayList7.indexOf(this.G.b);
                                        byte b5 = i22Var.N2;
                                        d dVar = i22Var.Z1;
                                        if (b5 != 0) {
                                            i2 = 1;
                                        } else if (dVar instanceof yv1) {
                                            yv1Var = (yv1) dVar;
                                            i2 = 0;
                                            if (dVar == null) {
                                                dVar = LaunchActivity.Q();
                                            }
                                            if (!i22Var.W3.B()) {
                                                gm.t1(dVar.getFragmentView().findFocus());
                                                gm.t1(i22Var.c.findFocus());
                                            }
                                            PhotoViewer.r0().T1(null, dVar, x62Var.a);
                                            PhotoViewer.r0().U1(i22Var);
                                            PhotoViewer r0 = PhotoViewer.r0();
                                            int i14 = i22Var.P3;
                                            boolean z2 = i22Var.Q3;
                                            r0.h = i14;
                                            r0.n = z2;
                                            this.O.a = arrayList7;
                                            PhotoViewer.r0().o1(new ArrayList(arrayList7), indexOf3, i2, false, this.O, yv1Var);
                                            x62Var.Q.getClass();
                                            if (ChatAttachAlertPhotoLayout.T()) {
                                                PhotoViewer r02 = PhotoViewer.r0();
                                                Editable text = i22Var.U0().getText();
                                                r02.u7 = true;
                                                r02.v7 = text;
                                                u62Var4 = null;
                                                r02.J1(null, text, false, false);
                                                r02.E2(null);
                                                this.G = u62Var4;
                                                this.E = 0L;
                                                x62Var.K = u62Var4;
                                                this.H = 0.0f;
                                            }
                                        } else {
                                            i2 = 4;
                                        }
                                        yv1Var = null;
                                        if (dVar == null) {
                                        }
                                        if (!i22Var.W3.B()) {
                                        }
                                        PhotoViewer.r0().T1(null, dVar, x62Var.a);
                                        PhotoViewer.r0().U1(i22Var);
                                        PhotoViewer r03 = PhotoViewer.r0();
                                        int i142 = i22Var.P3;
                                        boolean z22 = i22Var.Q3;
                                        r03.h = i142;
                                        r03.n = z22;
                                        this.O.a = arrayList7;
                                        PhotoViewer.r0().o1(new ArrayList(arrayList7), indexOf3, i2, false, this.O, yv1Var);
                                        x62Var.Q.getClass();
                                        if (ChatAttachAlertPhotoLayout.T()) {
                                        }
                                    } else if (x62Var.getSelectedItemsCount() > 1) {
                                        jo6 jo6Var = this.G.b;
                                        int indexOf4 = ((ArrayList) this.F.k.f).indexOf(jo6Var);
                                        if (indexOf4 >= 0) {
                                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x62Var.Q;
                                            if (chatAttachAlertPhotoLayout != null) {
                                                ArrayList arrayList8 = new ArrayList(chatAttachAlertPhotoLayout.getSelectedPhotos().entrySet());
                                                int size6 = arrayList8.size();
                                                int i15 = 0;
                                                while (true) {
                                                    if (i15 >= size6) {
                                                        break;
                                                    }
                                                    if (((Map.Entry) arrayList8.get(i15)).getValue() == jo6Var) {
                                                        this.c.put(jo6Var, ((Map.Entry) arrayList8.get(i15)).getKey());
                                                        break;
                                                    }
                                                    i15++;
                                                }
                                            }
                                            v62 v62Var7 = this.F;
                                            ((ArrayList) v62Var7.k.f).remove(indexOf4);
                                            v62Var7.b(v62Var7.k, true);
                                            j();
                                            i(x62Var.Q, false);
                                            int i16 = this.P + 1;
                                            this.P = i16;
                                            x62Var.x.k(0L, 82, jo6Var, null, null, new up6((Object) this, (Object) v62Var7, (Object) jo6Var, indexOf4, (byte) 15));
                                            postDelayed(new eh((Object) this, i16, (byte) 25), 4000L);
                                        }
                                        ValueAnimator valueAnimator2 = x62Var.M;
                                        if (valueAnimator2 != null) {
                                            valueAnimator2.cancel();
                                        }
                                    }
                                    u62Var4 = null;
                                    this.G = u62Var4;
                                    this.E = 0L;
                                    x62Var.K = u62Var4;
                                    this.H = 0.0f;
                                }
                            }
                            z = true;
                            i = 1;
                            if (action != i || action == 3) {
                                this.E = 0L;
                                removeCallbacks(o1Var);
                                this.M = false;
                                if (!z) {
                                    h();
                                    return i;
                                }
                            }
                            return z;
                        }
                        z = false;
                        i = 1;
                        if (action != i) {
                        }
                        this.E = 0L;
                        removeCallbacks(o1Var);
                        this.M = false;
                        if (!z) {
                        }
                        return z;
                    }
                    x62Var.E = x;
                    x62Var.F = y;
                    if (!this.M) {
                        this.M = true;
                        postDelayed(o1Var, 16L);
                    }
                    invalidate();
                } else {
                    this.F = v62Var;
                    this.G = u62Var;
                    x62Var.E = x;
                    x62Var.F = y;
                    x62Var.K = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.E = elapsedRealtime;
                    gm.d3(new of2(this, elapsedRealtime, this.G, (byte) 18), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                }
                z = true;
                i = 1;
                if (action != i) {
                }
                this.E = 0L;
                removeCallbacks(o1Var);
                this.M = false;
                if (!z) {
                }
                return z;
            }
        } else {
            f = 2.0f;
            v62Var2 = null;
        }
        u62Var2 = null;
        action = motionEvent.getAction();
        o1 o1Var2 = this.N;
        if (action == 0) {
        }
        if (action == 2) {
        }
        if (action == 1) {
        }
        z = false;
        i = 1;
        if (action != i) {
        }
        this.E = 0L;
        removeCallbacks(o1Var2);
        this.M = false;
        if (!z) {
        }
        return z;
    }
}
