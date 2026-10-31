package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x8 extends View implements org.telegram.ui.ActionBar.k6 {
    public PorterDuffColorFilter a;
    public int b;
    public final boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final Paint f;
    public final org.telegram.ui.Components.t5 h;
    public float n;
    public w8 r;
    public q20 s;
    public final /* synthetic */ y8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(y8 y8Var, Context context, boolean z10) {
        super(context);
        this.w = y8Var;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new org.telegram.ui.Components.t5(this, 0L, 320L, gr.h);
        this.c = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, y8Var.i1));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.n = this.h.e(false, arrayList.size());
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((w8) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((w8) arrayList.get(i11)).a(canvas);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((w8) arrayList.get(i10)).k.P();
            i10++;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((w8) arrayList.get(i10)).k.R();
            i10++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        w8 w8Var;
        q20 q20Var;
        if (motionEvent.getAction() == 0) {
            w8 w8Var2 = this.r;
            if (w8Var2 != null) {
                w8Var2.q.c(false);
            }
            this.r = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((w8) arrayList.get(i10)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.r = (w8) arrayList.get(i10);
                    break;
                }
                i10++;
            }
            w8 w8Var3 = this.r;
            if (w8Var3 != null) {
                w8Var3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (w8Var = this.r) != null && !w8Var.p && w8Var.b.contains(motionEvent.getX(), motionEvent.getY()) && (q20Var = this.s) != null) {
                q20Var.a(Long.valueOf(this.r.j));
            }
            w8 w8Var4 = this.r;
            if (w8Var4 != null) {
                w8Var4.q.c(false);
            }
            this.r = null;
        }
        return this.r != null;
    }

    public void setMyPrivacy(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                return;
            }
            w8 w8Var = (w8) arrayList.get(i10);
            if (w8Var.i) {
                w8Var.b(j10);
                return;
            }
            i10++;
        }
    }

    public void setOnSenderClickListener(q20 q20Var) {
        this.s = q20Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [org.telegram.ui.Components.t5] */
    /* JADX WARN: Type inference failed for: r11v4, types: [org.telegram.ui.Components.t5] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.graphics.Typeface] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [rh.w8] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, rh.w8] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, rh.w8] */
    /* JADX WARN: Type inference failed for: r9v9, types: [rh.w8] */
    public void setSenders(ArrayList<t8> arrayList) {
        ArrayList arrayList2;
        dq[] dqVarArr;
        ?? r72;
        ?? r82;
        ?? r92;
        ?? r22;
        String t10;
        ArrayList<t8> arrayList3 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            dqVarArr = null;
            t8 t8Var = null;
            r72 = this.e;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            w8 w8Var = (w8) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                t8 t8Var2 = arrayList3.get(i11);
                boolean z10 = t8Var2.b;
                if ((z10 && w8Var.i) || (!w8Var.i && !z10 && t8Var2.c == w8Var.j)) {
                    t8Var = arrayList3.get(i11);
                    break;
                }
            }
            if (t8Var == null) {
                w8Var.k.R();
                arrayList2.remove(i10);
                i10--;
                w8Var.a = -1;
                r72.add(w8Var);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            t8 t8Var3 = arrayList3.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                w8 w8Var2 = (w8) arrayList2.get(i13);
                boolean z11 = w8Var2.i;
                if ((z11 && t8Var3.b) || (!z11 && !t8Var3.b && w8Var2.j == t8Var3.c)) {
                    r92 = (w8) arrayList2.get(i13);
                    break;
                }
            }
            r92 = dqVarArr;
            if (r92 == null) {
                for (int i14 = 0; i14 < r72.size(); i14++) {
                    w8 w8Var3 = (w8) r72.get(i14);
                    boolean z12 = w8Var3.i;
                    if ((z12 && t8Var3.b) || (!z12 && !t8Var3.b && w8Var3.j == t8Var3.c)) {
                        r92 = (w8) r72.get(i14);
                        break;
                    }
                }
                if (r92 != null) {
                    r72.remove(r92);
                    r92.k.P();
                    arrayList2.add(r92);
                }
            }
            if (r92 == null) {
                r92 = new w8(this, t8Var3.b, t8Var3.c);
                r92.d.e(r82, 0.0f);
                arrayList2.add(r92);
                r92.c.e(r82, (arrayList3.size() - r82) - i12);
            }
            x8 x8Var = r92.w;
            y8 y8Var = x8Var.w;
            r92.a = (arrayList3.size() - r82) - i12;
            long j10 = t8Var3.d;
            Paint paint = r92.h;
            r92.o = new qz0(h8.T0(i0.a.k(j10, ',', new StringBuilder("⭐️")), 0.85f, dqVarArr), 12.0f, org.telegram.messenger.i0.o1("fonts/num.otf"));
            boolean z13 = x8Var.c;
            int i15 = y8Var.j1;
            if (z13) {
                int i16 = (int) j10;
                r92.f = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(16.0f), new int[]{th.o.b(i15, i16, 4), th.o.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r92.r = i0.b.f(0.5f, th.o.b(i15, i16, 4), th.o.b(i15, i16, 3));
                paint.setShader(r92.f);
            } else {
                paint.setShader(null);
                r92.r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = r92.s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(r92.r, PorterDuff.Mode.SRC_IN));
            }
            if (this.c) {
                int i17 = i12 + 1;
                r92.v = i17;
                r92.u = new qz0(i0.a.i(i17, ""), 10.0f, org.telegram.messenger.i0.o1("fonts/num.otf"));
                if (i17 > 0 && r92.s == null) {
                    Drawable mutate = x8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r92.s = mutate;
                    int i18 = r92.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = x8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r92.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, y8Var.i1), mode));
                }
            }
            if (t8Var3.b) {
                r92.b(this.w.v1);
            } else {
                boolean z14 = t8Var3.a;
                if (!r92.i && r92.p != z14) {
                    r92.p = z14;
                    if (z14) {
                        r22 = null;
                        t10 = cd.L0(2131745066, null);
                    } else {
                        r22 = null;
                        t10 = org.telegram.messenger.o5.t(r92.j);
                    }
                    r92.n = new qz0(t10, 12.0f, r22);
                    x8Var.invalidate();
                    i12++;
                    arrayList3 = arrayList;
                    dqVarArr = r22;
                    r82 = 1;
                }
            }
            r22 = null;
            i12++;
            arrayList3 = arrayList;
            dqVarArr = r22;
            r82 = 1;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:3:0x0002, B:5:0x0015, B:9:0x0028, B:11:0x002e, B:13:0x0036, B:15:0x003a, B:17:0x0042, B:19:0x0047, B:24:0x004a, B:28:0x001c), top: B:2:0x0002 }] */
    @Override // org.telegram.ui.ActionBar.k6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateColors() {
        int i10;
        Drawable drawable;
        ArrayList arrayList = this.d;
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.w.i1);
            this.f.setColor(w02);
            if (this.a != null) {
                if (w02 != this.b) {
                }
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    w8 w8Var = (w8) arrayList.get(i10);
                    if (w8Var != null && (drawable = w8Var.t) != null) {
                        ColorFilter colorFilter = drawable.getColorFilter();
                        PorterDuffColorFilter porterDuffColorFilter = this.a;
                        if (colorFilter != porterDuffColorFilter) {
                            w8Var.t.setColorFilter(porterDuffColorFilter);
                        }
                    }
                }
                invalidate();
            }
            this.b = w02;
            this.a = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
            while (i10 < arrayList.size()) {
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
