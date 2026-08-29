package v5;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import g9.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Components.n6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l {
    public static l e;
    public int a;
    public final Object b;
    public final Object c;
    public Object d;

    public l(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = i10;
        this.d = str;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public static synchronized l b(Context context) {
        l lVar;
        synchronized (l.class) {
            try {
                if (e == null) {
                    e = new l(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new w("MessengerIpcClient"))));
                }
                lVar = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    public String a(int i10, String str, long j10, long j11) {
        String[] strArr = (String[]) this.b;
        String[] strArr2 = (String[]) this.d;
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.a;
            if (i11 >= i12) {
                sb2.append(strArr[i12]);
                return sb2.toString();
            }
            sb2.append(strArr[i11]);
            int i13 = ((int[]) this.c)[i11];
            if (i13 == 1) {
                sb2.append(str);
            } else if (i13 == 2) {
                sb2.append(String.format(Locale.US, strArr2[i11], Long.valueOf(j10)));
            } else if (i13 == 3) {
                sb2.append(String.format(Locale.US, strArr2[i11], Integer.valueOf(i10)));
            } else if (i13 == 4) {
                sb2.append(String.format(Locale.US, strArr2[i11], Long.valueOf(j11)));
            }
            i11++;
        }
    }

    public synchronized Task c(k kVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(kVar.toString()));
            }
            if (!((j) this.d).d(kVar)) {
                j jVar = new j(this);
                this.d = jVar;
                jVar.d(kVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return kVar.b.getTask();
    }

    public /* synthetic */ l(Serializable serializable, Serializable serializable2, Serializable serializable3, int i10) {
        this.b = serializable;
        this.c = serializable2;
        this.d = serializable3;
        this.a = i10;
    }

    public l(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new j(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public l() {
        n6 n6Var = new n6(true, true, true, false);
        this.d = n6Var;
        Paint paint = new Paint(1);
        n6Var.t(AndroidUtilities.dp(13.0f));
        n6Var.r(-1);
        n6Var.u(AndroidUtilities.bold());
        paint.setColor(i0.a.k(-16777216, 58));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        this.b = spannableStringBuilder;
        spannableStringBuilder.append((CharSequence) " ").setSpan(new n2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        this.c = spannableStringBuilder2;
        spannableStringBuilder2.append((CharSequence) " ").setSpan(new n2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
    }
}
