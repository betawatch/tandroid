// default package

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
