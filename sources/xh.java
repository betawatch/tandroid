// default package

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xh extends g4c {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (vib) null);
        this.e = alertDialog$Builder;
    }

    @Override // g4c, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.M0.run();
        super.onClick(view);
    }
}
