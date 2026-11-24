// default package

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xi extends g6c {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (wkb) null);
        this.e = alertDialog$Builder;
    }

    @Override // g6c, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.M0.run();
        super.onClick(view);
    }
}
