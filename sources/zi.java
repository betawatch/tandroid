// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zi extends LinearLayout {
    public final /* synthetic */ byte a;
    public boolean b;
    public final Object c;
    public Object d;
    public final /* synthetic */ lp7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(Activity activity, yi yiVar) {
        super(activity);
        this.a = (byte) 0;
        this.e = yiVar;
        this.c = new uib(":", 18.0f, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        uib uibVar;
        switch (this.a) {
            case 0:
                Object obj = this.c;
                int i = cmb.F6;
                ((uib) obj).c((getWidth() - ((uib) obj).c) / 2.0f, getHeight() / 2.0f, 1.0f, cmb.w0(null, i, false), canvas);
                if (!jb6.c0) {
                    boolean z = ((yi) this.e).getValue() % 24 < 12;
                    if (this.b != z || (uibVar = (uib) this.d) == null) {
                        this.b = z;
                        uibVar = new uib(z ? "AM" : "PM", 18.0f, null);
                        this.d = uibVar;
                    }
                    uibVar.c((getWidth() / 2.0f) + gm.L(43.0f), (getHeight() / 2.0f) + gm.L(1.0f), 1.0f, cmb.w0(null, i, false), canvas);
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        byte b = this.a;
        Object obj = this.c;
        lp7 lp7Var = this.e;
        switch (b) {
            case 1:
                dj djVar = (dj) lp7Var;
                cj cjVar = (cj) this.d;
                lp7 lp7Var2 = (lp7) obj;
                this.b = true;
                Point point = gm.q;
                i3 = point.x > point.y ? 3 : 5;
                lp7Var2.setItemCount(i3);
                cjVar.setItemCount(i3);
                djVar.setItemCount(i3);
                lp7Var2.getLayoutParams().height = gm.L(42.0f) * i3;
                cjVar.getLayoutParams().height = gm.L(42.0f) * i3;
                djVar.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            case 2:
                gj gjVar = (gj) lp7Var;
                ej ejVar = (ej) this.d;
                lp7 lp7Var3 = (lp7) obj;
                this.b = true;
                Point point2 = gm.q;
                i3 = point2.x > point2.y ? 3 : 5;
                lp7Var3.setItemCount(i3);
                ejVar.setItemCount(i3);
                gjVar.setItemCount(i3);
                lp7Var3.getLayoutParams().height = gm.L(42.0f) * i3;
                ejVar.getLayoutParams().height = gm.L(42.0f) * i3;
                gjVar.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            case 3:
                lj ljVar = (lj) lp7Var;
                kj kjVar = (kj) this.d;
                lp7 lp7Var4 = (lp7) obj;
                this.b = true;
                Point point3 = gm.q;
                i3 = point3.x > point3.y ? 3 : 5;
                lp7Var4.setItemCount(i3);
                kjVar.setItemCount(i3);
                ljVar.setItemCount(i3);
                lp7Var4.getLayoutParams().height = gm.L(42.0f) * i3;
                kjVar.getLayoutParams().height = gm.L(42.0f) * i3;
                ljVar.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            case 4:
                oj ojVar = (oj) lp7Var;
                nj njVar = (nj) this.d;
                lp7 lp7Var5 = (lp7) obj;
                this.b = true;
                Point point4 = gm.q;
                i3 = point4.x > point4.y ? 3 : 5;
                lp7Var5.setItemCount(i3);
                njVar.setItemCount(i3);
                ojVar.setItemCount(i3);
                lp7Var5.getLayoutParams().height = gm.L(42.0f) * i3;
                njVar.getLayoutParams().height = gm.L(42.0f) * i3;
                ojVar.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            case 5:
                tj tjVar = (tj) this.d;
                sj sjVar = (sj) obj;
                this.b = true;
                Point point5 = gm.q;
                i3 = point5.x > point5.y ? 3 : 5;
                sjVar.setItemCount(i3);
                sjVar.getLayoutParams().height = gm.L(42.0f) * i3;
                tjVar.setItemCount(i3);
                tjVar.getLayoutParams().height = gm.L(42.0f) * i3;
                lp7Var.setItemCount(i3);
                lp7Var.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            case 6:
                lp7 lp7Var6 = (lp7) this.d;
                lp7 lp7Var7 = (lp7) obj;
                this.b = true;
                Point point6 = gm.q;
                i3 = point6.x > point6.y ? 3 : 5;
                lp7Var7.setItemCount(i3);
                lp7Var6.setItemCount(i3);
                lp7Var.setItemCount(i3);
                lp7Var7.getLayoutParams().height = gm.L(42.0f) * i3;
                lp7Var6.getLayoutParams().height = gm.L(42.0f) * i3;
                lp7Var.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            case 7:
                bk bkVar = (bk) lp7Var;
                ak akVar = (ak) this.d;
                lp7 lp7Var8 = (lp7) obj;
                this.b = true;
                Point point7 = gm.q;
                i3 = point7.x > point7.y ? 3 : 5;
                lp7Var8.setItemCount(i3);
                akVar.setItemCount(i3);
                bkVar.setItemCount(i3);
                lp7Var8.getLayoutParams().height = gm.L(42.0f) * i3;
                akVar.getLayoutParams().height = gm.L(42.0f) * i3;
                bkVar.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.a) {
            case 1:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 2:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 3:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 4:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 5:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 6:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 7:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi(Context context, lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3, byte b) {
        super(context);
        this.a = b;
        this.c = lp7Var;
        this.d = lp7Var2;
        this.e = lp7Var3;
        this.b = false;
    }
}
