// default package

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vqb implements View.OnTouchListener {
    public final /* synthetic */ byte a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
            default:
                int i = UndoView.j0;
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
        }
    }
}
