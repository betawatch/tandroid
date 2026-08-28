package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {
    public final /* synthetic */ f a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, f fVar) {
        super(inputConnection, false);
        this.a = fVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i9, Bundle bundle) {
        j jVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            jVar = new j(new h(inputContentInfo));
        }
        if (this.a.h(jVar, i9, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i9, bundle);
    }
}
