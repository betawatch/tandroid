package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import org.telegram.ui.Components.qt;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {
    public final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Object[] objArr;
        ResultReceiver resultReceiver;
        e eVar = this.a;
        boolean z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        if (bundle != null) {
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                objArr = false;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                objArr = true;
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                try {
                    Uri uri = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                    Uri uri2 = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                    int i7 = bundle.getInt(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                    Bundle bundle2 = (Bundle) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                    if (uri != null && clipDescription != null) {
                        z9 = eVar.k(new qt(uri, clipDescription, uri2), i7, bundle2);
                    }
                    if (resultReceiver != null) {
                        resultReceiver.send(z9 ? 1 : 0, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                resultReceiver = null;
            }
        }
        if (z9) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
