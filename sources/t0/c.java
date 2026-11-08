package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import org.telegram.ui.Components.rt;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {
    public final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.a = eVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        rt rtVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            rtVar = new rt(new g(inputContentInfo), 15);
        }
        if (this.a.k(rtVar, i7, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i7, bundle);
    }
}
