// default package

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ye implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oh2[] b;

    public /* synthetic */ ye(oh2[] oh2VarArr, byte b) {
        this.a = b;
        this.b = oh2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        oh2[] oh2VarArr = this.b;
        switch (b) {
            case 0:
                oh2VarArr[((Integer) view.getTag()).intValue()].c(!oh2VarArr[r4.intValue()].b(), true);
                break;
            case 1:
                oh2VarArr[((Integer) view.getTag()).intValue()].c(!oh2VarArr[r4.intValue()].b(), true);
                break;
            case 2:
                oh2VarArr[((Integer) view.getTag()).intValue()].c(!oh2VarArr[r4.intValue()].b(), true);
                break;
            case 3:
                oh2VarArr[0].c(!r3.b(), true);
                break;
            default:
                RectF rectF = ProfileActivity.e7;
                oh2VarArr[0].c(!r3.b(), true);
                break;
        }
    }
}
