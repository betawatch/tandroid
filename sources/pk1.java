// default package

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pk1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pk1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                qk1 qk1Var = (qk1) obj;
                qk1Var.c.setPivotX(r3.getMeasuredWidth() * 0.7f);
                qk1Var.b.setPivotX(r2.getMeasuredWidth() * 0.7f);
                break;
            case 1:
                view.post((la7) obj);
                break;
            case 2:
                bx4 bx4Var = (bx4) obj;
                if (i4 - i2 != i8 - i6) {
                    hl.c3(new qw4(bx4Var, (byte) 2));
                    break;
                }
                break;
            case 3:
                fu5 fu5Var = (fu5) obj;
                if (fu5Var.E()) {
                    fu5Var.P();
                    break;
                }
                break;
            case 4:
                ((rx5) obj).d();
                break;
            case 5:
                ((on9) obj).a0();
                break;
            case 6:
                ((uba) obj).o0();
                break;
            case 7:
                v3b v3bVar = (v3b) obj;
                c19 c19Var = v3bVar.h;
                if (c19Var != null && c19Var.getLayout() != null) {
                    v3bVar.G = c19Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
            case 8:
                wsc wscVar = (wsc) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    Iterator it = wscVar.f.values().iterator();
                    while (it.hasNext()) {
                        ((vsc) it.next()).K = false;
                    }
                    wscVar.f0();
                    break;
                }
                break;
            default:
                atc atcVar = (atc) obj;
                if (i4 - i2 < i8 - i6) {
                    ArrayList arrayList = atcVar.w;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj2 = arrayList.get(i9);
                        i9++;
                        zuc zucVar = (zuc) obj2;
                        if (zucVar.hasFocus()) {
                            zucVar.requestRectangleOnScreen(new Rect(0, 0, zucVar.getWidth(), zucVar.getHeight()), true);
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }
}
