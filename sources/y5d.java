// default package

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y5d implements Continuation, yyb, zef {
    public static final /* synthetic */ y5d a = new y5d();

    @Override // yyb
    public final Object apply(Object obj) {
        return ((toe) obj).a();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new aj2(intent);
        }
        return null;
    }
}
