package x5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.tasks.Task;
import i9.u;
import j7.r7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import l7.w0;
import m.f3;
import m.m1;
import m.q;
import r0.j0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k {
    public static k e;
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public k(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = i10;
        this.d = str;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public static synchronized k d(Context context) {
        k kVar;
        synchronized (k.class) {
            try {
                if (e == null) {
                    e = new k(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new u("MessengerIpcClient"))));
                }
                kVar = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    public void a() {
        ImageView imageView = (ImageView) this.b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m1.a(drawable);
        }
        if (drawable != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 && i10 == 21) {
                if (((f3) this.d) == null) {
                    this.d = new f3();
                }
                f3 f3Var = (f3) this.d;
                f3Var.c = null;
                f3Var.b = false;
                f3Var.d = null;
                f3Var.a = false;
                ColorStateList imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    f3Var.b = true;
                    f3Var.c = imageTintList;
                }
                PorterDuff.Mode imageTintMode = imageView.getImageTintMode();
                if (imageTintMode != null) {
                    f3Var.a = true;
                    f3Var.d = imageTintMode;
                }
                if (f3Var.b || f3Var.a) {
                    q.d(drawable, f3Var, imageView.getDrawableState());
                    return;
                }
            }
            f3 f3Var2 = (f3) this.c;
            if (f3Var2 != null) {
                q.d(drawable, f3Var2, imageView.getDrawableState());
            }
        }
    }

    public String b(int i10, String str, long j10, long j11) {
        String[] strArr = (String[]) this.b;
        String[] strArr2 = (String[]) this.d;
        StringBuilder sb = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.a;
            if (i11 >= i12) {
                sb.append(strArr[i12]);
                return sb.toString();
            }
            sb.append(strArr[i11]);
            int i13 = ((int[]) this.c)[i11];
            if (i13 == 1) {
                sb.append(str);
            } else if (i13 == 2) {
                sb.append(String.format(Locale.US, strArr2[i11], Long.valueOf(j10)));
            } else if (i13 == 3) {
                sb.append(String.format(Locale.US, strArr2[i11], Integer.valueOf(i10)));
            } else if (i13 == 4) {
                sb.append(String.format(Locale.US, strArr2[i11], Long.valueOf(j11)));
            }
            i11++;
        }
    }

    public void c(AttributeSet attributeSet, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.b;
        Context context = imageView.getContext();
        int[] iArr = f.a.f;
        w0 y10 = w0.y(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) y10.c;
        j0.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) y10.c, i10);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = r7.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                m1.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList s6 = y10.s(2);
                int i11 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(s6);
                if (i11 == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode b10 = m1.b(typedArray.getInt(3, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode(b10);
                if (i12 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            y10.A();
        } catch (Throwable th2) {
            y10.A();
            throw th2;
        }
    }

    public synchronized Task e(j jVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(jVar.toString()));
            }
            if (!((i) this.d).d(jVar)) {
                i iVar = new i(this);
                this.d = iVar;
                iVar.d(jVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jVar.b.getTask();
    }

    public /* synthetic */ k(Serializable serializable, Serializable serializable2, Serializable serializable3, int i10) {
        this.b = serializable;
        this.c = serializable2;
        this.d = serializable3;
        this.a = i10;
    }

    public k(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new i(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public k(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }
}
