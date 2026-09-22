package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class o8 extends View {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final Paint d;
    public final org.telegram.ui.Components.c6 e;
    public float f;
    public n8 h;
    public Utilities.Callback n;
    public final /* synthetic */ p8 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(p8 p8Var, Context context, boolean z10) {
        super(context);
        this.r = p8Var;
        this.b = new ArrayList();
        this.c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.c6(this, 0L, 320L, qr.h);
        this.a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, p8Var.b));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.b;
        this.f = this.e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((n8) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((n8) arrayList.get(i11)).a(canvas);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((n8) arrayList.get(i10)).k.onAttachedToWindow();
            i10++;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((n8) arrayList.get(i10)).k.onDetachedFromWindow();
            i10++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n8 n8Var;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            n8 n8Var2 = this.h;
            if (n8Var2 != null) {
                n8Var2.q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((n8) arrayList.get(i10)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (n8) arrayList.get(i10);
                    break;
                }
                i10++;
            }
            n8 n8Var3 = this.h;
            if (n8Var3 != null) {
                n8Var3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (n8Var = this.h) != null && !n8Var.p && n8Var.b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.n) != null) {
                callback.run(Long.valueOf(this.h.j));
            }
            n8 n8Var4 = this.h;
            if (n8Var4 != null) {
                n8Var4.q.c(false);
            }
            this.h = null;
        }
        return this.h != null;
    }

    public void setMyPrivacy(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            n8 n8Var = (n8) arrayList.get(i10);
            if (n8Var.i) {
                n8Var.b(j3);
                return;
            }
            i10++;
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.n = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [org.telegram.ui.Components.c6] */
    /* JADX WARN: Type inference failed for: r11v4, types: [org.telegram.ui.Components.c6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [yh.n8] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, yh.n8] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, yh.n8] */
    /* JADX WARN: Type inference failed for: r9v9, types: [yh.n8] */
    public void setSenders(ArrayList<k8> arrayList) {
        ArrayList arrayList2;
        oq[] oqVarArr;
        ?? r72;
        ?? r82;
        ?? r92;
        ArrayList<k8> arrayList3 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.b;
            int size = arrayList2.size();
            oqVarArr = null;
            k8 k8Var = null;
            r72 = this.c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            n8 n8Var = (n8) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                k8 k8Var2 = arrayList3.get(i11);
                boolean z10 = k8Var2.b;
                if ((z10 && n8Var.i) || (!n8Var.i && !z10 && k8Var2.c == n8Var.j)) {
                    k8Var = arrayList3.get(i11);
                    break;
                }
            }
            if (k8Var == null) {
                n8Var.k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                n8Var.a = -1;
                r72.add(n8Var);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            k8 k8Var3 = arrayList3.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                n8 n8Var2 = (n8) arrayList2.get(i13);
                boolean z11 = n8Var2.i;
                if ((z11 && k8Var3.b) || (!z11 && !k8Var3.b && n8Var2.j == k8Var3.c)) {
                    r92 = (n8) arrayList2.get(i13);
                    break;
                }
            }
            r92 = oqVarArr;
            if (r92 == null) {
                for (int i14 = 0; i14 < r72.size(); i14++) {
                    n8 n8Var3 = (n8) r72.get(i14);
                    boolean z12 = n8Var3.i;
                    if ((z12 && k8Var3.b) || (!z12 && !k8Var3.b && n8Var3.j == k8Var3.c)) {
                        r92 = (n8) r72.get(i14);
                        break;
                    }
                }
                if (r92 != null) {
                    r72.remove(r92);
                    r92.k.onAttachedToWindow();
                    arrayList2.add(r92);
                }
            }
            if (r92 == null) {
                r92 = new n8(this, k8Var3.b, k8Var3.c);
                r92.d.d(0.0f, r82);
                arrayList2.add(r92);
                r92.c.d((arrayList3.size() - r82) - i12, r82);
            }
            o8 o8Var = r92.w;
            p8 p8Var = o8Var.r;
            r92.a = (arrayList3.size() - r82) - i12;
            long j3 = k8Var3.d;
            Paint paint = r92.h;
            r92.o = new g01(x7.R0(hg.c.k(j3, ',', new StringBuilder("⭐️")), 0.85f, oqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = o8Var.a;
            int i15 = p8Var.c;
            if (z13) {
                int i16 = (int) j3;
                r92.f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r92.r = i0.a.d(0.5f, ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3));
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
            if (this.a) {
                int i17 = i12 + 1;
                r92.v = i17;
                r92.u = new g01(hg.c.i(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && r92.s == null) {
                    Drawable mutate = o8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r92.s = mutate;
                    int i18 = r92.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = o8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r92.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, p8Var.b), mode));
                }
            }
            if (k8Var3.b) {
                r92.b(this.r.E);
            } else {
                boolean z14 = k8Var3.a;
                if (!r92.i && r92.p != z14) {
                    r92.p = z14;
                    oqVarArr = null;
                    r92.n = new g01(z14 ? LocaleController.getString(R.string.StarsReactionAnonymous) : DialogObject.getShortName(r92.j), 12.0f, null);
                    o8Var.invalidate();
                    i12++;
                    arrayList3 = arrayList;
                    r82 = 1;
                }
            }
            oqVarArr = null;
            i12++;
            arrayList3 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
