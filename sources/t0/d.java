package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {
    public final /* synthetic */ f a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, f fVar) {
        super(inputConnection, false);
        this.a = fVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        j jVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            jVar = new j(new h(inputContentInfo));
        }
        if (this.a.h(jVar, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
