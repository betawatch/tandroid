package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {
    public final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.a = eVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        y00 y00Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            y00Var = new y00(new g(inputContentInfo));
        }
        if (this.a.m(y00Var, i3, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i3, bundle);
    }
}
