// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class y7a extends FrameLayout {
    public final /* synthetic */ b8a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7a(b8a b8aVar, Context context) {
        super(context);
        this.a = b8aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b8a b8aVar = this.a;
        View contentView = b8aVar.getContentView();
        int[] iArr = new int[2];
        contentView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] + b8aVar.E;
        iArr[1] = iArr[1] + b8aVar.F;
        getLocationInWindow(new int[2]);
        if (motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) {
            if (motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1]) {
                if (motionEvent.getY() < contentView.getHeight() + iArr[1]) {
                    motionEvent.offsetLocation(r2[0] - iArr[0], (hl.m + r2[1]) - iArr[1]);
                    return contentView.dispatchTouchEvent(motionEvent);
                }
            }
        }
        if (!b8aVar.A && !b8aVar.D) {
            b8aVar.D = true;
            b8aVar.l(new vpa[0]);
        }
        return true;
    }
}
