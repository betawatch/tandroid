// default package

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sj8 implements k66 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mz0 b;

    public /* synthetic */ sj8(mz0 mz0Var, byte b) {
        this.a = b;
        this.b = mz0Var;
    }

    @Override // k66
    public final void a(ClickableSpan clickableSpan) {
        byte b = this.a;
        mz0 mz0Var = this.b;
        switch (b) {
            case 0:
                yj8 yj8Var = (yj8) mz0Var;
                ArrayList arrayList = new ArrayList();
                arrayList.add(yj8Var.x2);
                qv0 qv0Var = new qv0(yj8Var, (byte) 10);
                d dVar = yj8Var.o2;
                if (dVar != null) {
                    qv0Var.setParentFragment(dVar);
                }
                new vj8(yj8Var, qv0Var, yj8Var.getContext(), yj8Var.J0, arrayList).show();
                break;
            default:
                c2c c2cVar = (c2c) mz0Var;
                if (clickableSpan != null) {
                    clickableSpan.onClick(c2cVar.b);
                    break;
                }
                break;
        }
    }
}
