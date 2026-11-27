// default package

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
