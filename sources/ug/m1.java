package ug;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import b8.ke;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import gi.d7;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements d7, Continuation {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ m1(ke keVar, String str) {
        this.a = 2;
        this.b = str;
    }

    @Override // gi.d7
    public Bitmap f(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b, options);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.a) {
            case 1:
                if (!task.isSuccessful()) {
                    throw new ExecutionException(task.getException());
                }
                String str = (String) task.getResult();
                if (!TextUtils.isEmpty(str)) {
                    String str2 = this.b;
                    if (str.endsWith(str2)) {
                        return str2;
                    }
                }
                throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
            default:
                return !task.isSuccessful() ? Tasks.forException(ke.q(task)) : Tasks.forResult(new Pair((String) task.getResult(), this.b));
        }
    }

    public /* synthetic */ m1(String str, int i3) {
        this.a = i3;
        this.b = str;
    }
}
