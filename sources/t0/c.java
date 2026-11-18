package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import org.telegram.ui.Components.of;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        of ofVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            ofVar = new of(new g(inputContentInfo), 18);
        }
        if (this.a.d(ofVar, i7, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i7, bundle);
    }
}
