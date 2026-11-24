// default package

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xob implements View.OnTouchListener {
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
