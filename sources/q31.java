// default package

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class q31 implements ggd {
    public static final v11 f = new v11();
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q31(wn7 wn7Var) {
        Notification.Builder builder;
        String str;
        int i;
        Notification.BubbleMetadata bubbleMetadata;
        int i2;
        Notification.BubbleMetadata bubbleMetadata2;
        yd6 yd6Var;
        Bundle[] bundleArr;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        this.e = new Bundle();
        this.d = wn7Var;
        Context context = wn7Var.a;
        ArrayList arrayList3 = wn7Var.G;
        ArrayList arrayList4 = wn7Var.c;
        ArrayList arrayList5 = wn7Var.d;
        this.b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = qq5.a(context, wn7Var.y);
            this.c = builder;
        } else {
            builder = new Notification.Builder(context);
            this.c = builder;
        }
        Notification notification = wn7Var.F;
        Context context2 = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(wn7Var.e).setContentText(wn7Var.f).setContentInfo(null).setContentIntent(wn7Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(wn7Var.i).setProgress(wn7Var.n, wn7Var.o, wn7Var.p);
        IconCompat iconCompat = wn7Var.h;
        builder.setLargeIcon(iconCompat == null ? null : jpe.a(iconCompat, context));
        builder.setSubText(wn7Var.m).setUsesChronometer(false).setPriority(wn7Var.j);
        ArrayList arrayList6 = wn7Var.b;
        int size = arrayList6.size();
        int i4 = 0;
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (i4 >= size) {
                break;
            }
            Object obj = arrayList6.get(i4);
            i4++;
            ln7 ln7Var = (ln7) obj;
            IconCompat a = ln7Var.a();
            byte b = ln7Var.f;
            boolean z = ln7Var.d;
            Bundle bundle = ln7Var.a;
            ArrayList arrayList7 = arrayList6;
            int i5 = size;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(a != null ? jpe.a(a, context2) : context2, ln7Var.h, ln7Var.i);
            t99[] t99VarArr = ln7Var.c;
            if (t99VarArr != null) {
                RemoteInput[] a2 = t99.a(t99VarArr);
                int length = a2.length;
                int i6 = 0;
                while (i6 < length) {
                    RemoteInput[] remoteInputArr = a2;
                    builder2.addRemoteInput(remoteInputArr[i6]);
                    i6++;
                    a2 = remoteInputArr;
                }
            }
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 24) {
                lh0.l(builder2, z);
            }
            bundle2.putInt("android.support.action.semanticAction", b);
            if (i7 >= 28) {
                go.A(builder2, b);
            }
            if (i7 >= 29) {
                sr.r(builder2);
            }
            if (i7 >= 31) {
                zz.t(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", ln7Var.e);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.c).addAction(builder2.build());
            arrayList6 = arrayList7;
            size = i5;
            context2 = null;
        }
        Bundle bundle3 = wn7Var.v;
        if (bundle3 != null) {
            ((Bundle) this.e).putAll(bundle3);
        }
        ((Notification.Builder) this.c).setShowWhen(wn7Var.k);
        ((Notification.Builder) this.c).setLocalOnly(wn7Var.t);
        ((Notification.Builder) this.c).setGroup(wn7Var.q);
        ((Notification.Builder) this.c).setSortKey(wn7Var.s);
        ((Notification.Builder) this.c).setGroupSummary(wn7Var.r);
        this.a = wn7Var.C;
        ((Notification.Builder) this.c).setCategory(wn7Var.u);
        ((Notification.Builder) this.c).setColor(wn7Var.w);
        ((Notification.Builder) this.c).setVisibility(wn7Var.x);
        ((Notification.Builder) this.c).setPublicVersion(null);
        ((Notification.Builder) this.c).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                int size2 = arrayList4.size();
                int i8 = 0;
                while (i8 < size2) {
                    Object obj2 = arrayList4.get(i8);
                    i8++;
                    b78 b78Var = (b78) obj2;
                    CharSequence charSequence = b78Var.a;
                    String str2 = b78Var.c;
                    if (str2 == null) {
                        if (charSequence != null) {
                            str2 = "name:" + ((Object) charSequence);
                        } else {
                            str2 = "";
                        }
                    }
                    arrayList2.add(str2);
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    ss ssVar = new ss(arrayList3.size() + arrayList2.size());
                    ssVar.addAll(arrayList2);
                    ssVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(ssVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj3 = arrayList3.get(i9);
                i9++;
                ((Notification.Builder) this.c).addPerson((String) obj3);
            }
        }
        if (arrayList5.size() > 0) {
            Bundle bundle4 = wn7Var.v;
            if (bundle4 == null) {
                bundle4 = new Bundle();
                wn7Var.v = bundle4;
            }
            Bundle bundle5 = bundle4.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i10 = 0;
            while (i10 < arrayList5.size()) {
                String num = Integer.toString(i10);
                ln7 ln7Var2 = (ln7) arrayList5.get(i10);
                Bundle bundle8 = new Bundle();
                IconCompat a3 = ln7Var2.a();
                Bundle bundle9 = ln7Var2.a;
                bundle8.putInt("icon", a3 != null ? a3.g() : 0);
                bundle8.putCharSequence("title", ln7Var2.h);
                bundle8.putParcelable("actionIntent", ln7Var2.i);
                Bundle bundle10 = new Bundle(bundle9);
                bundle10.putBoolean(str, ln7Var2.d);
                bundle8.putBundle("extras", bundle10);
                t99[] t99VarArr2 = ln7Var2.c;
                if (t99VarArr2 == null) {
                    arrayList = arrayList5;
                    i3 = i10;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[t99VarArr2.length];
                    arrayList = arrayList5;
                    i3 = i10;
                    int i11 = 0;
                    while (i11 < t99VarArr2.length) {
                        t99 t99Var = t99VarArr2[i11];
                        int i12 = i11;
                        Bundle bundle11 = new Bundle();
                        t99Var.getClass();
                        t99[] t99VarArr3 = t99VarArr2;
                        String str3 = str;
                        bundle11.putString("resultKey", "extra_voice_reply");
                        bundle11.putCharSequence("label", t99Var.a);
                        bundle11.putCharSequenceArray("choices", null);
                        bundle11.putBoolean("allowFreeFormInput", true);
                        bundle11.putBundle("extras", t99Var.b);
                        HashSet hashSet = t99Var.c;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList8 = new ArrayList<>(hashSet.size());
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                arrayList8.add((String) it.next());
                            }
                            bundle11.putStringArrayList("allowedDataTypes", arrayList8);
                        }
                        bundleArr[i12] = bundle11;
                        i11 = i12 + 1;
                        t99VarArr2 = t99VarArr3;
                        str = str3;
                    }
                }
                String str4 = str;
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", ln7Var2.e);
                bundle8.putInt("semanticAction", ln7Var2.f);
                bundle7.putBundle(num, bundle8);
                i10 = i3 + 1;
                arrayList5 = arrayList;
                str = str4;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            Bundle bundle12 = wn7Var.v;
            Bundle bundle13 = bundle12;
            if (bundle12 == null) {
                Bundle bundle14 = new Bundle();
                wn7Var.v = bundle14;
                bundle13 = bundle14;
            }
            bundle13.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 24) {
            ((Notification.Builder) this.c).setExtras(wn7Var.v);
            lh0.m((Notification.Builder) this.c);
        }
        if (i13 >= 26) {
            qq5.h((Notification.Builder) this.c);
            qq5.j((Notification.Builder) this.c);
            qq5.k((Notification.Builder) this.c, wn7Var.z);
            qq5.l((Notification.Builder) this.c, wn7Var.B);
            qq5.i((Notification.Builder) this.c, wn7Var.C ? 1 : 0);
            if (!TextUtils.isEmpty(wn7Var.y)) {
                bubbleMetadata = null;
                i = 0;
                ((Notification.Builder) this.c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
                if (i13 >= 28) {
                    int size4 = arrayList4.size();
                    int i14 = i;
                    while (i14 < size4) {
                        Object obj4 = arrayList4.get(i14);
                        i14++;
                        b78 b78Var2 = (b78) obj4;
                        Notification.Builder builder3 = (Notification.Builder) this.c;
                        b78Var2.getClass();
                        go.a(builder3, go.G(b78Var2));
                    }
                }
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    return;
                }
                sr.o((Notification.Builder) this.c, wn7Var.D);
                Notification.Builder builder4 = (Notification.Builder) this.c;
                un7 un7Var = wn7Var.E;
                if (un7Var != null) {
                    if (i2 >= 30) {
                        bubbleMetadata2 = tn7.a(un7Var);
                    } else if (i2 == 29) {
                        bubbleMetadata2 = sn7.a(un7Var);
                    }
                    sr.q(builder4, bubbleMetadata2);
                    yd6Var = wn7Var.A;
                    if (yd6Var == null) {
                        sr.u((Notification.Builder) this.c, yd6Var.b);
                        return;
                    }
                    return;
                }
                bubbleMetadata2 = bubbleMetadata;
                sr.q(builder4, bubbleMetadata2);
                yd6Var = wn7Var.A;
                if (yd6Var == null) {
                }
            }
        }
        i = 0;
        bubbleMetadata = null;
        if (i13 >= 28) {
        }
        i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
        }
    }

    public static void b(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // ggd
    public final ArrayList a(jq5 jq5Var) {
        Bitmap createBitmap;
        if (((trd) this.e) == null) {
            zzb();
        }
        if (((trd) this.e) == null) {
            throw new kg7("Waiting for the image labeling module to be downloaded. Please wait.", 14);
        }
        Bitmap bitmap = jq5Var.a;
        xve.h(bitmap);
        int i = jq5Var.d;
        int i2 = jq5Var.b;
        int i3 = jq5Var.c;
        if (i == 0) {
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        } else {
            Matrix matrix = new Matrix();
            matrix.postRotate(i);
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
        }
        try {
            trd trdVar = (trd) this.e;
            xve.h(trdVar);
            br7 br7Var = new br7(createBitmap);
            Parcel R = trdVar.R();
            int i4 = mld.a;
            R.writeStrongBinder(br7Var);
            R.writeInt(1);
            int r = bye.r(R, 20293);
            bye.q(R, 2, 4);
            R.writeInt(-1);
            bye.s(R, r);
            Parcel T = trdVar.T(R, 1);
            tge[] tgeVarArr = (tge[]) T.createTypedArray(tge.CREATOR);
            T.recycle();
            ArrayList arrayList = new ArrayList();
            for (tge tgeVar : tgeVarArr) {
                arrayList.add(new im5(tgeVar.c, tgeVar.d, tgeVar.b, tgeVar.a));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new kg7("Failed to run legacy image labeler.", e);
        }
    }

    @Override // ggd
    public final void zzb() {
        oae wxdVar;
        String str = (String) this.d;
        Context context = (Context) this.b;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (((trd) this.e) == null) {
            try {
                IBinder b = vs3.c(context, vs3.b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
                int i = e3e.b;
                if (b == null) {
                    wxdVar = null;
                } else {
                    IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                    wxdVar = queryLocalInterface instanceof oae ? (oae) queryLocalInterface : new wxd(b, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", (byte) 7);
                }
                trd Z = ((wxd) wxdVar).Z(new br7(context), (hre) this.c);
                this.e = Z;
                if (Z != null || this.a) {
                    return;
                }
                Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                zt7.a(context);
                this.a = true;
            } catch (RemoteException e) {
                throw new kg7("Failed to create legacy image labeler.", e);
            } catch (ss3 e2) {
                if (str.equals("com.google.android.gms.vision.dynamite")) {
                    throw new kg7("Failed to load deprecated vision dynamite module.", e2);
                }
                if (this.a) {
                    return;
                }
                Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                zt7.a(context);
                this.a = true;
            }
        }
    }

    @Override // ggd
    public final void zzc() {
        trd trdVar = (trd) this.e;
        if (trdVar != null) {
            try {
                trdVar.V(trdVar.R(), 2);
            } catch (RemoteException e) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e);
            }
            this.e = null;
        }
    }

    public q31(Context context, lm5 lm5Var) {
        this.b = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.c = new hre(1, -1, lm5Var.a, 1);
        j05.b.getClass();
        this.d = c15.a(context) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
    }

    public q31(e84 e84Var, ko4 ko4Var, usb usbVar, uif uifVar, boolean z) {
        this.b = e84Var;
        this.c = ko4Var;
        this.d = usbVar;
        this.e = uifVar;
        this.a = z;
    }
}
