// default package

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class yd implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ag2[] b;

    public /* synthetic */ yd(ag2[] ag2VarArr, byte b) {
        this.a = b;
        this.b = ag2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ag2[] ag2VarArr = this.b;
        switch (b) {
            case 0:
                ag2VarArr[((Integer) view.getTag()).intValue()].c(!ag2VarArr[r4.intValue()].b(), true);
                break;
            case 1:
                ag2VarArr[((Integer) view.getTag()).intValue()].c(!ag2VarArr[r4.intValue()].b(), true);
                break;
            case 2:
                ag2VarArr[((Integer) view.getTag()).intValue()].c(!ag2VarArr[r4.intValue()].b(), true);
                break;
            case 3:
                ag2VarArr[0].c(!r3.b(), true);
                break;
            default:
                RectF rectF = ProfileActivity.Z6;
                ag2VarArr[0].c(!r3.b(), true);
                break;
        }
    }
}
