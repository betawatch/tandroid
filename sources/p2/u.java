package p2;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Message;
import android.os.Parcel;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.gms.internal.play_billing.g4;
import j$.util.DesugarCollections;
import j7.l1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements a4.z {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ u(char c3, int i10) {
        this.a = i10;
    }

    @Override // a4.z
    public MediaCodecInfo a(int i10) {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c)[i10];
    }

    public Object b() {
        Object[] objArr = (Object[]) this.c;
        int i10 = this.b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.b--;
        return obj;
    }

    public void c(long j10) {
        int i10 = this.b;
        long[] jArr = (long[]) this.c;
        if (i10 == jArr.length) {
            this.c = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = (long[]) this.c;
        int i11 = this.b;
        this.b = i11 + 1;
        jArr2[i11] = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public g.f d() {
        g.c cVar = (g.c) this.c;
        g.f fVar = new g.f(cVar.a, this.b);
        View view = cVar.e;
        g.e eVar = fVar.f;
        if (view != null) {
            eVar.r = view;
        } else {
            CharSequence charSequence = cVar.d;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = cVar.c;
            if (drawable != null) {
                eVar.n = drawable;
                ImageView imageView = eVar.o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = cVar.f;
        if (charSequence2 != null) {
            androidx.biometric.y yVar = cVar.g;
            eVar.getClass();
            Message obtainMessage = yVar != null ? eVar.z.obtainMessage(-2, yVar) : null;
            eVar.j = charSequence2;
            eVar.k = obtainMessage;
        }
        if (cVar.i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cVar.b.inflate(eVar.v, (ViewGroup) null);
            int i10 = cVar.l ? eVar.w : eVar.x;
            Object obj = cVar.i;
            ?? r82 = obj;
            if (obj == null) {
                r82 = new g.d(cVar.a, i10, R.id.text1, null);
            }
            eVar.s = r82;
            eVar.t = cVar.m;
            if (cVar.j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.b(cVar, eVar));
            }
            if (cVar.l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.e = alertController$RecycleListView;
        }
        View view2 = cVar.k;
        if (view2 != null) {
            eVar.f = view2;
            eVar.g = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        l.l lVar = cVar.h;
        if (lVar != null) {
            fVar.setOnKeyListener(lVar);
        }
        return fVar;
    }

    public long e(int i10) {
        if (i10 >= 0 && i10 < this.b) {
            return ((long[]) this.c)[i10];
        }
        StringBuilder o10 = l1.o(i10, "Invalid index ", ", size is ");
        o10.append(this.b);
        throw new IndexOutOfBoundsException(o10.toString());
    }

    public synchronized List f() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.c));
    }

    public long g(o3.h hVar) {
        f5.w wVar = (f5.w) this.c;
        int i10 = 0;
        hVar.f(wVar.a, 0, 1, false);
        int i11 = wVar.a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        hVar.f(wVar.a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (wVar.a[i10] & 255) + (i14 << 8);
        }
        this.b = i13 + 1 + this.b;
        return i14;
    }

    public void h(Object instance) {
        Object[] objArr = (Object[]) this.c;
        kotlin.jvm.internal.j.e(instance, "instance");
        int i10 = this.b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i12 = this.b;
        if (i12 < objArr.length) {
            objArr[i12] = instance;
            this.b = i12 + 1;
        }
    }

    @Override // a4.z
    public boolean i(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public String j(g4 g4Var) {
        w wVar = (w) this.c;
        int i10 = this.b;
        try {
            if (wVar.E == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.g gVar = wVar.E;
            String packageName = wVar.C.getPackageName();
            String str = i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            v vVar = new v(g4Var);
            com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
            Parcel S0 = eVar.S0();
            S0.writeString(packageName);
            S0.writeString(str);
            int i11 = com.google.android.gms.internal.play_billing.d.a;
            S0.writeStrongBinder(vVar);
            try {
                eVar.b.transact(1, S0, null, 1);
                S0.recycle();
                return "billingOverrideService.getBillingOverride";
            } catch (Throwable th2) {
                S0.recycle();
                throw th2;
            }
        } catch (Exception e10) {
            wVar.F(95, 28, z.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            g4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override // a4.z
    public boolean q(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // a4.z
    public int r() {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c).length;
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    @Override // a4.z
    public boolean x() {
        return true;
    }

    public /* synthetic */ u(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public u(w5.a aVar, int i10) {
        this.a = 3;
        z5.l.h(aVar);
        this.c = aVar;
        this.b = i10;
    }

    public u(int i10, byte b10) {
        this.a = i10;
        switch (i10) {
            case 7:
                this.c = new ArrayList();
                this.b = 128;
                break;
            case 8:
                this.b = 0;
                this.c = new StringBuilder();
                break;
            case 9:
            case 10:
            default:
                this.c = new long[32];
                break;
            case 11:
                this.c = new f5.w(8);
                break;
        }
    }

    public u(int i10) {
        this.a = 9;
        if (i10 > 0) {
            this.c = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public u(int i10, a5.e[] eVarArr) {
        this.a = 10;
        this.b = i10;
        this.c = eVarArr;
    }

    public u(Context context) {
        this.a = 5;
        int e10 = g.f.e(context, 0);
        this.c = new g.c(new ContextThemeWrapper(context, g.f.e(context, e10)));
        this.b = e10;
    }

    public u(boolean z10, boolean z11) {
        this.a = 1;
        this.b = (z10 || z11) ? 1 : 0;
    }
}
