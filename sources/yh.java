// default package

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class yh extends f8c {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (rmb) null);
        this.e = alertDialog$Builder;
    }

    @Override // f8c, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.M0.run();
        super.onClick(view);
    }
}
