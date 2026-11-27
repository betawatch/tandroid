// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class sq9 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ id b;

    public /* synthetic */ sq9(id idVar, byte b) {
        this.a = b;
        this.b = idVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        id idVar = this.b;
        switch (b) {
            case 0:
                hl.t1(textView);
                View c = idVar.c(-1);
                if (c != null) {
                    c.callOnClick();
                }
                return false;
            default:
                if (i != 6) {
                    return false;
                }
                idVar.c(-1).callOnClick();
                return true;
        }
    }
}
