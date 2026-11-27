// default package

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class r6d implements OnCompleteListener {
    public final n05 a;
    public final char b;
    public final ho c;
    public final long d;
    public final long e;

    /* JADX WARN: Multi-variable type inference failed */
    public r6d(n05 n05Var, int i, ho hoVar, long j, long j2) {
        this.a = n05Var;
        this.b = i;
        this.c = hoVar;
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ys2 a(l6d l6dVar, hg0 hg0Var, int i) {
        ore oreVar = hg0Var.B;
        ys2 ys2Var = oreVar == null ? null : oreVar.d;
        if (ys2Var != null && ys2Var.b) {
            int[] iArr = ys2Var.d;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = ys2Var.f;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] == i) {
                            break;
                        }
                        i2++;
                    }
                }
                if (l6dVar.n >= ys2Var.e) {
                    return ys2Var;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (l6dVar.n >= ys2Var.e) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        n05 n05Var = this.a;
        if (n05Var.f()) {
            an9 an9Var = (an9) zm9.I0().b;
            if (an9Var == null || an9Var.b) {
                l6d l6dVar = (l6d) n05Var.s.get(this.c);
                if (l6dVar != null) {
                    d05 d05Var = l6dVar.b;
                    if (d05Var instanceof hg0) {
                        d05 d05Var2 = d05Var;
                        long j3 = this.d;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        short s = d05Var2.v;
                        if (an9Var != null) {
                            z &= an9Var.c;
                            i = an9Var.d;
                            i3 = an9Var.e;
                            i2 = an9Var.a;
                            if (d05Var2.B != null && !d05Var2.r()) {
                                ys2 a = a(l6dVar, d05Var2, this.b);
                                if (a == null) {
                                    return;
                                }
                                boolean z2 = a.c && j3 > 0;
                                i3 = a.e;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i7 = i;
                        int i8 = -1;
                        if (task.isSuccessful()) {
                            i5 = 0;
                        } else if (task.isCanceled()) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof ao) {
                                Status status = ((ao) exception).getStatus();
                                i4 = status.a;
                                ws2 ws2Var = status.d;
                                if (ws2Var != null) {
                                    i5 = i4;
                                    i6 = ws2Var.b;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i8 = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = currentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        s6d s6dVar = new s6d(new cg7(this.b, i5, i6, j, j2, null, null, s, i8), i2, i7, i3);
                        b99 b99Var = n05Var.y;
                        b99Var.sendMessage(b99Var.obtainMessage(18, s6dVar));
                    }
                }
            }
        }
    }
}
