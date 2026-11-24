// default package

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wmb implements View.OnTouchListener {
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
