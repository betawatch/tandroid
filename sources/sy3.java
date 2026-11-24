// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sy3 extends FrameLayout {
    public final /* synthetic */ az3 E;
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final ln s;
    public ImageReceiver w;
    public boolean x;
    public final ln y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy3(az3 az3Var, Context context) {
        super(context);
        this.E = az3Var;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        d53 d53Var = d53.h;
        this.s = new ln(this, 0L, 350L, d53Var);
        this.y = new ln(this, 0L, 320L, d53Var);
    }

    public final void a() {
        gn[] gnVarArr;
        az3 az3Var = this.E;
        hx hxVar = az3Var.q1;
        if (hxVar == null) {
            gnVarArr = new gn[0];
        } else {
            gn[] gnVarArr2 = new gn[hxVar.getChildCount()];
            for (int i = 0; i < hxVar.getChildCount(); i++) {
                View childAt = hxVar.getChildAt(i);
                if (childAt instanceof ty3) {
                    gnVarArr2[i] = ((ty3) childAt).c;
                }
            }
            gnVarArr = gnVarArr2;
        }
        az3Var.l1 = gn.update(3, this, gnVarArr, (LongSparseArray<vm>) az3Var.l1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        ry3 ry3Var;
        float f3;
        float f4;
        gn gnVar;
        PorterDuffColorFilter porterDuffColorFilter;
        Canvas canvas2 = canvas;
        az3 az3Var = this.E;
        wi2 wi2Var = az3Var.z1;
        hx hxVar = az3Var.q1;
        if (this.d) {
            int v0 = cmb.v0(cmb.g5, az3Var.J0);
            Paint paint = this.a;
            paint.setColor(v0);
            cmb.m(paint);
            Path path = this.b;
            path.reset();
            float D0 = az3Var.D0();
            float d = this.s.d(D0 <= ((float) az3Var.b.getPaddingTop()));
            float R1 = gm.R1(D0, 0.0f, d);
            if (this.w != null) {
                float L = gm.L(140.0f);
                f = 20.0f;
                float L2 = gm.L(20.0f);
                if (R1 < L + L2) {
                    this.x = false;
                }
                f2 = 2.0f;
                this.w.setAlpha(this.y.d(this.x));
                float alpha = this.w.getAlpha();
                ImageReceiver imageReceiver = this.w;
                if (alpha > 0.0f) {
                    float alpha2 = ((imageReceiver.getAlpha() * 0.4f) + 0.6f) * L;
                    float f5 = alpha2 / 2.0f;
                    this.w.i0((getWidth() / 2.0f) - f5, ((R1 - L2) - (L / 2.0f)) - f5, alpha2, alpha2);
                    this.w.h(canvas2, null);
                } else {
                    imageReceiver.K();
                    this.w = null;
                }
            } else {
                f = 20.0f;
                f2 = 2.0f;
            }
            float f6 = 1.0f;
            float L3 = gm.L((1.0f - d) * 14.0f);
            RectF rectF = gm.P;
            rectF.set(getPaddingLeft(), R1, getWidth() - getPaddingRight(), getBottom() + L3);
            path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
            canvas2.drawPath(path, paint);
            boolean z = d > 0.5f;
            Boolean bool = this.c;
            if (bool == null || z != bool.booleanValue()) {
                this.c = Boolean.valueOf(z);
                az3Var.J0(z);
            }
            cmb.s0.setColor(cmb.v0(cmb.yj, az3Var.J0));
            cmb.s0.setAlpha((int) (pqe.a(R1 / gm.L(f), 0.0f, 1.0f) * cmb.s0.getAlpha()));
            int L4 = gm.L(36.0f);
            float L5 = R1 + gm.L(10.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, gm.L(4.0f) + L5);
            canvas2.drawRoundRect(rectF, gm.L(f2), gm.L(f2), cmb.s0);
            az3Var.s1.setVisibility((hxVar.canScrollVertically(1) || az3Var.v1.getVisibility() == 0) ? 0 : 4);
            if (hxVar != null) {
                canvas2.save();
                canvas2.translate(hxVar.getLeft(), hxVar.getY() + 0.0f);
                canvas2.clipRect(0, 0, hxVar.getWidth(), hxVar.getHeight());
                float f7 = 255.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, hxVar.getWidth(), hxVar.getHeight(), (int) (hxVar.getAlpha() * 255.0f), 31);
                int i = 0;
                while (true) {
                    sparseArray = this.e;
                    int size = sparseArray.size();
                    arrayList = this.n;
                    if (i >= size) {
                        break;
                    }
                    ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i);
                    arrayList3.clear();
                    arrayList.add(arrayList3);
                    i++;
                }
                sparseArray.clear();
                int i2 = 0;
                while (i2 < hxVar.getChildCount()) {
                    View childAt = hxVar.getChildAt(i2);
                    if (childAt instanceof ty3) {
                        ty3 ty3Var = (ty3) childAt;
                        if (ty3Var.isPressed()) {
                            float f8 = ty3Var.e;
                            if (f8 != f6) {
                                ty3Var.e = Utilities.i(f8 + 0.16f, f6, 0.0f);
                                ty3Var.invalidate();
                            }
                        }
                        if (az3Var.l1 == null || (gnVar = ty3Var.c) == null) {
                            f3 = f6;
                        } else {
                            f3 = f6;
                            vm vmVar = (vm) az3Var.l1.get(gnVar.getDocumentId());
                            if (vmVar != null) {
                                int v02 = cmb.v0(cmb.F6, az3Var.J0);
                                if (v02 != az3Var.O1 || (porterDuffColorFilter = az3Var.N1) == null) {
                                    az3Var.O1 = v02;
                                    f4 = f7;
                                    porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN);
                                    az3Var.N1 = porterDuffColorFilter;
                                } else {
                                    f4 = f7;
                                }
                                vmVar.setColorFilter(porterDuffColorFilter);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) td4.m(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(ty3Var);
                            }
                        }
                        f4 = f7;
                    } else {
                        f3 = f6;
                        f4 = f7;
                        canvas2.save();
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        childAt.draw(canvas2);
                        canvas2.restore();
                    }
                    i2++;
                    f6 = f3;
                    f7 = f4;
                }
                float f9 = f6;
                float f10 = f7;
                ArrayList arrayList5 = this.h;
                arrayList5.clear();
                ArrayList arrayList6 = this.f;
                arrayList5.addAll(arrayList6);
                arrayList6.clear();
                long currentTimeMillis = System.currentTimeMillis();
                int i3 = 0;
                while (true) {
                    int size2 = sparseArray.size();
                    arrayList2 = this.r;
                    if (i3 >= size2) {
                        break;
                    }
                    ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i3);
                    View view = (View) arrayList7.get(0);
                    hxVar.getClass();
                    int R = RecyclerView.R(view);
                    long j = currentTimeMillis;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList5.size()) {
                            ry3Var = null;
                            break;
                        } else {
                            if (((ry3) arrayList5.get(i4)).N == R) {
                                ry3Var = (ry3) arrayList5.get(i4);
                                arrayList5.remove(i4);
                                break;
                            }
                            i4++;
                        }
                    }
                    if (ry3Var == null) {
                        if (arrayList2.isEmpty()) {
                            ry3Var = new ry3(this);
                            ry3Var.l(7);
                        } else {
                            ry3Var = (ry3) td4.m(1, arrayList2);
                        }
                        ry3Var.N = R;
                        ry3Var.e();
                    }
                    arrayList6.add(ry3Var);
                    ry3Var.O = arrayList7;
                    canvas2.save();
                    canvas2.translate(0.0f, view.getY() + view.getPaddingTop());
                    Canvas canvas3 = canvas2;
                    ry3 ry3Var2 = ry3Var;
                    currentTimeMillis = j;
                    ry3Var2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view.getMeasuredHeight() - view.getPaddingBottom(), 1.0f);
                    canvas2 = canvas3;
                    canvas2.restore();
                    i3++;
                }
                for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((ry3) arrayList5.get(i5));
                        ((ry3) arrayList5.get(i5)).O = null;
                        ((ry3) arrayList5.get(i5)).k();
                    } else {
                        ((ry3) arrayList5.get(i5)).f();
                    }
                }
                arrayList5.clear();
                canvas2.restore();
                canvas2.restore();
                if (hxVar.getAlpha() < f9) {
                    int width = getWidth() / 2;
                    int height = (getHeight() + ((int) L5)) / 2;
                    int L6 = gm.L(16.0f);
                    wi2Var.setAlpha((int) ((f9 - hxVar.getAlpha()) * f10));
                    wi2Var.setBounds(width - L6, height - L6, width + L6, height + L6);
                    wi2Var.draw(canvas2);
                    invalidate();
                }
            }
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            az3 az3Var = this.E;
            if (y < az3Var.D0() - gm.L(6.0f)) {
                az3Var.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        ImageReceiver imageReceiver = this.w;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        int i = 0;
        this.d = false;
        int i2 = 0;
        while (true) {
            arrayList = this.f;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((ry3) arrayList.get(i2)).f();
            i2++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i >= arrayList2.size()) {
                break;
            }
            ((ry3) arrayList2.get(i)).f();
            i++;
        }
        arrayList.clear();
        gn.release(this, (LongSparseArray<vm>) this.E.l1);
        ImageReceiver imageReceiver = this.w;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
    }
}
