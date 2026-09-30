package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertDialog$Builder b;

    public /* synthetic */ tz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.a = i10;
        this.b = alertDialog$Builder;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.b.a.d(-1).callOnClick();
                break;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.b.a.d(-1).callOnClick();
                break;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.b.a.d(-1).callOnClick();
                break;
        }
        return false;
    }
}
