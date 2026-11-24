// default package

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xk7 {
    public ub6 A;
    public long B;
    public boolean C;
    public final boolean D;
    public vk7 E;
    public final Notification F;
    public final ArrayList G;
    public final Context a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public boolean k;
    public gl7 l;
    public CharSequence m;
    public byte n;
    public int o;
    public boolean p;
    public String q;
    public boolean r;
    public String s;
    public boolean t;
    public String u;
    public Bundle v;
    public int w;
    public int x;
    public String y;
    public String z;

    public xk7(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.k = true;
        this.t = false;
        this.w = 0;
        this.x = 0;
        this.C = false;
        Notification notification = new Notification();
        this.F = notification;
        this.a = context;
        this.y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.G = new ArrayList();
        this.D = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i, PendingIntent pendingIntent, String str) {
        this.b.add(new mk7(i != 0 ? IconCompat.e(null, "", i) : null, str, pendingIntent, new Bundle(), null, true, 0, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x044a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Notification b() {
        Notification.Builder builder;
        String str;
        int i;
        Notification.BubbleMetadata bubbleMetadata;
        int i2;
        gl7 gl7Var;
        int i3;
        Notification build;
        Notification.BubbleMetadata bubbleMetadata2;
        ub6 ub6Var;
        Bundle[] bundleArr;
        ArrayList arrayList;
        int i4;
        ArrayList arrayList2;
        h31 h31Var = new h31();
        h31Var.e = new Bundle();
        h31Var.d = this;
        Context context = this.a;
        h31Var.b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = no5.a(context, this.y);
            h31Var.c = builder;
        } else {
            builder = new Notification.Builder(context);
            h31Var.c = builder;
        }
        Notification notification = this.F;
        Context context2 = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(this.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.i).setProgress(this.n, this.o, this.p);
        IconCompat iconCompat = this.h;
        builder.setLargeIcon(iconCompat == null ? null : nke.a(iconCompat, context));
        builder.setSubText(this.m).setUsesChronometer(false).setPriority(this.j);
        ArrayList arrayList3 = this.b;
        int size = arrayList3.size();
        int i5 = 0;
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (i5 >= size) {
                break;
            }
            Object obj = arrayList3.get(i5);
            i5++;
            mk7 mk7Var = (mk7) obj;
            IconCompat a = mk7Var.a();
            byte b = mk7Var.f;
            boolean z = mk7Var.d;
            Bundle bundle = mk7Var.a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(a != null ? nke.a(a, context2) : context2, mk7Var.h, mk7Var.i);
            g69[] g69VarArr = mk7Var.c;
            if (g69VarArr != null) {
                for (RemoteInput remoteInput : g69.a(g69VarArr)) {
                    builder2.addRemoteInput(remoteInput);
                }
            }
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                kh0.l(builder2, z);
            }
            bundle2.putInt("android.support.action.semanticAction", b);
            if (i6 >= 28) {
                fo.A(builder2, b);
            }
            if (i6 >= 29) {
                rr.r(builder2);
            }
            if (i6 >= 31) {
                yz.t(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", mk7Var.e);
            builder2.addExtras(bundle2);
            ((Notification.Builder) h31Var.c).addAction(builder2.build());
            context2 = null;
        }
        Bundle bundle3 = this.v;
        if (bundle3 != null) {
            ((Bundle) h31Var.e).putAll(bundle3);
        }
        ((Notification.Builder) h31Var.c).setShowWhen(this.k);
        ((Notification.Builder) h31Var.c).setLocalOnly(this.t);
        ((Notification.Builder) h31Var.c).setGroup(this.q);
        ((Notification.Builder) h31Var.c).setSortKey(this.s);
        ((Notification.Builder) h31Var.c).setGroupSummary(this.r);
        h31Var.a = this.C;
        ((Notification.Builder) h31Var.c).setCategory(this.u);
        ((Notification.Builder) h31Var.c).setColor(this.w);
        ((Notification.Builder) h31Var.c).setVisibility(this.x);
        ((Notification.Builder) h31Var.c).setPublicVersion(null);
        ((Notification.Builder) h31Var.c).setSound(notification.sound, notification.audioAttributes);
        int i7 = Build.VERSION.SDK_INT;
        ArrayList arrayList4 = this.G;
        ArrayList arrayList5 = this.c;
        if (i7 < 28) {
            if (arrayList5 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList5.size());
                int size2 = arrayList5.size();
                int i8 = 0;
                while (i8 < size2) {
                    Object obj2 = arrayList5.get(i8);
                    i8++;
                    l38 l38Var = (l38) obj2;
                    CharSequence charSequence = l38Var.a;
                    String str2 = l38Var.c;
                    if (str2 == null) {
                        str2 = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList2.add(str2);
                }
            }
            if (arrayList2 != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList2;
                } else {
                    rs rsVar = new rs(arrayList4.size() + arrayList2.size());
                    rsVar.addAll(arrayList2);
                    rsVar.addAll(arrayList4);
                    arrayList4 = new ArrayList(rsVar);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            int size3 = arrayList4.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj3 = arrayList4.get(i9);
                i9++;
                ((Notification.Builder) h31Var.c).addPerson((String) obj3);
            }
        }
        ArrayList arrayList6 = this.d;
        if (arrayList6.size() > 0) {
            Bundle bundle4 = this.v;
            if (bundle4 == null) {
                bundle4 = new Bundle();
                this.v = bundle4;
            }
            Bundle bundle5 = bundle4.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i10 = 0;
            while (i10 < arrayList6.size()) {
                String num = Integer.toString(i10);
                mk7 mk7Var2 = (mk7) arrayList6.get(i10);
                Bundle bundle8 = new Bundle();
                IconCompat a2 = mk7Var2.a();
                Bundle bundle9 = mk7Var2.a;
                bundle8.putInt("icon", a2 != null ? a2.g() : 0);
                bundle8.putCharSequence("title", mk7Var2.h);
                bundle8.putParcelable("actionIntent", mk7Var2.i);
                Bundle bundle10 = new Bundle(bundle9);
                bundle10.putBoolean(str, mk7Var2.d);
                bundle8.putBundle("extras", bundle10);
                g69[] g69VarArr2 = mk7Var2.c;
                if (g69VarArr2 == null) {
                    arrayList = arrayList6;
                    i4 = i10;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[g69VarArr2.length];
                    arrayList = arrayList6;
                    i4 = i10;
                    int i11 = 0;
                    while (i11 < g69VarArr2.length) {
                        g69 g69Var = g69VarArr2[i11];
                        int i12 = i11;
                        Bundle bundle11 = new Bundle();
                        g69Var.getClass();
                        String str3 = str;
                        g69[] g69VarArr3 = g69VarArr2;
                        bundle11.putString("resultKey", "extra_voice_reply");
                        bundle11.putCharSequence("label", g69Var.a);
                        bundle11.putCharSequenceArray("choices", null);
                        bundle11.putBoolean("allowFreeFormInput", true);
                        bundle11.putBundle("extras", g69Var.b);
                        HashSet hashSet = g69Var.c;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList7 = new ArrayList<>(hashSet.size());
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                arrayList7.add((String) it.next());
                            }
                            bundle11.putStringArrayList("allowedDataTypes", arrayList7);
                        }
                        bundleArr[i12] = bundle11;
                        i11 = i12 + 1;
                        str = str3;
                        g69VarArr2 = g69VarArr3;
                    }
                }
                String str4 = str;
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", mk7Var2.e);
                bundle8.putInt("semanticAction", mk7Var2.f);
                bundle7.putBundle(num, bundle8);
                i10 = i4 + 1;
                arrayList6 = arrayList;
                str = str4;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            Bundle bundle12 = this.v;
            Bundle bundle13 = bundle12;
            if (bundle12 == null) {
                Bundle bundle14 = new Bundle();
                this.v = bundle14;
                bundle13 = bundle14;
            }
            bundle13.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) h31Var.e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 24) {
            ((Notification.Builder) h31Var.c).setExtras(this.v);
            kh0.m((Notification.Builder) h31Var.c);
        }
        if (i13 >= 26) {
            no5.h((Notification.Builder) h31Var.c);
            no5.j((Notification.Builder) h31Var.c);
            no5.k((Notification.Builder) h31Var.c, this.z);
            no5.l((Notification.Builder) h31Var.c, this.B);
            no5.i((Notification.Builder) h31Var.c, this.C ? 1 : 0);
            if (!TextUtils.isEmpty(this.y)) {
                bubbleMetadata = null;
                i = 0;
                ((Notification.Builder) h31Var.c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
                if (i13 >= 28) {
                    int size4 = arrayList5.size();
                    int i14 = i;
                    while (i14 < size4) {
                        Object obj4 = arrayList5.get(i14);
                        i14++;
                        l38 l38Var2 = (l38) obj4;
                        Notification.Builder builder3 = (Notification.Builder) h31Var.c;
                        l38Var2.getClass();
                        fo.a(builder3, fo.G(l38Var2));
                    }
                }
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    rr.o((Notification.Builder) h31Var.c, this.D);
                    Notification.Builder builder4 = (Notification.Builder) h31Var.c;
                    vk7 vk7Var = this.E;
                    if (vk7Var != null) {
                        if (i2 >= 30) {
                            bubbleMetadata2 = uk7.a(vk7Var);
                        } else if (i2 == 29) {
                            bubbleMetadata2 = tk7.a(vk7Var);
                        }
                        rr.q(builder4, bubbleMetadata2);
                        ub6Var = this.A;
                        if (ub6Var != null) {
                            rr.u((Notification.Builder) h31Var.c, ub6Var.b);
                        }
                    }
                    bubbleMetadata2 = bubbleMetadata;
                    rr.q(builder4, bubbleMetadata2);
                    ub6Var = this.A;
                    if (ub6Var != null) {
                    }
                }
                xk7 xk7Var = (xk7) h31Var.d;
                gl7Var = xk7Var.l;
                if (gl7Var != null) {
                    gl7Var.b(h31Var);
                }
                Notification.Builder builder5 = (Notification.Builder) h31Var.c;
                boolean z2 = h31Var.a;
                i3 = Build.VERSION.SDK_INT;
                if (i3 < 26) {
                    build = builder5.build();
                } else if (i3 >= 24) {
                    build = builder5.build();
                    if (z2 != 0) {
                        if (build.getGroup() != null && (build.flags & 512) != 0 && z2 == 2) {
                            h31.i(build);
                        }
                        if (build.getGroup() != null && (build.flags & 512) == 0 && z2 == 1) {
                            h31.i(build);
                        }
                    }
                } else {
                    builder5.setExtras((Bundle) h31Var.e);
                    build = builder5.build();
                    if (z2 != 0) {
                        if (build.getGroup() != null && (build.flags & 512) != 0 && z2 == 2) {
                            h31.i(build);
                        }
                        if (build.getGroup() != null && (build.flags & 512) == 0 && z2 == 1) {
                            h31.i(build);
                        }
                    }
                }
                if (gl7Var != null) {
                    xk7Var.l.getClass();
                    Bundle bundle15 = build.extras;
                    if (bundle15 != null) {
                        gl7Var.a(bundle15);
                    }
                }
                return build;
            }
        }
        i = 0;
        bubbleMetadata = null;
        if (i13 >= 28) {
        }
        i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
        }
        xk7 xk7Var2 = (xk7) h31Var.d;
        gl7Var = xk7Var2.l;
        if (gl7Var != null) {
        }
        Notification.Builder builder52 = (Notification.Builder) h31Var.c;
        boolean z22 = h31Var.a;
        i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
        }
        if (gl7Var != null) {
        }
        return build;
    }

    public final void d(String str) {
        this.f = c(str);
    }

    public final void e(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void f(int i, boolean z) {
        Notification notification = this.F;
        if (z) {
            notification.flags |= i;
        } else {
            notification.flags &= ~i;
        }
    }

    public final void g(Bitmap bitmap) {
        IconCompat c;
        if (bitmap == null) {
            c = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            c = IconCompat.c(bitmap);
        }
        this.h = c;
    }

    public final void h(Uri uri) {
        Notification notification = this.F;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = wk7.a(wk7.d(wk7.c(wk7.b(), 4), 5));
    }

    public final void i(gl7 gl7Var) {
        if (this.l != gl7Var) {
            this.l = gl7Var;
            if (gl7Var.a != this) {
                gl7Var.a = this;
                i(gl7Var);
            }
        }
    }

    public final void j(String str) {
        this.m = c(str);
    }

    public final void k(String str) {
        this.F.tickerText = c(str);
    }

    public xk7(Context context) {
        this(context, null);
    }
}
