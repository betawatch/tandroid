// default package

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class rc extends Handler {
    public final /* synthetic */ byte a = 0;
    public WeakReference b;

    public rc(z89 z89Var) {
        this.b = new WeakReference(z89Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        yv6 yv6Var;
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i != -3 && i != -2 && i != -1) {
                    if (i == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        break;
                    }
                } else {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                }
                break;
            default:
                z89 z89Var = (z89) this.b.get();
                if (z89Var != null) {
                    SparseArray sparseArray = z89Var.n;
                    f99 f99Var = z89Var.r;
                    ArrayList arrayList = f99Var.w;
                    int i2 = message.what;
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    int i5 = 0;
                    a99 a99Var = null;
                    a99 a99Var2 = null;
                    switch (i2) {
                        case 0:
                            if (i3 == z89Var.h) {
                                z89Var.h = 0;
                                if (f99Var.E == z89Var) {
                                    f99Var.q();
                                }
                            }
                            if (((c99) sparseArray.get(i3)) != null) {
                                sparseArray.remove(i3);
                                c99.a(null, null);
                                break;
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (z89Var.f == 0 && i3 == z89Var.h && i4 >= 1) {
                                    z89Var.h = 0;
                                    z89Var.f = i4;
                                    fo4 a = fo4.a(bundle);
                                    if (f99Var.E == z89Var) {
                                        f99Var.g(a);
                                    }
                                    if (f99Var.E == z89Var) {
                                        f99Var.F = true;
                                        int size = arrayList.size();
                                        while (i5 < size) {
                                            ((a99) arrayList.get(i5)).b(f99Var.E);
                                            i5++;
                                        }
                                        gv6 gv6Var = (gv6) f99Var.h;
                                        if (gv6Var != null) {
                                            z89 z89Var2 = f99Var.E;
                                            int i6 = z89Var2.d;
                                            z89Var2.d = i6 + 1;
                                            z89Var2.b(10, i6, 0, gv6Var.a, null);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                c99 c99Var = (c99) sparseArray.get(i3);
                                if (c99Var != null) {
                                    sparseArray.remove(i3);
                                    c99Var.b(bundle2);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = peekData != null ? peekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((c99) sparseArray.get(i3)) != null) {
                                    sparseArray.remove(i3);
                                    c99.a(string, bundle3);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (z89Var.f != 0) {
                                    fo4 a2 = fo4.a(bundle4);
                                    if (f99Var.E == z89Var) {
                                        f99Var.g(a2);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (!(obj instanceof Bundle)) {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                                break;
                            } else {
                                Bundle bundle5 = (Bundle) obj;
                                c99 c99Var2 = (c99) sparseArray.get(i3);
                                if (!bundle5.containsKey("routeId")) {
                                    c99Var2.getClass();
                                    c99.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                    break;
                                } else {
                                    sparseArray.remove(i3);
                                    c99Var2.b(bundle5);
                                    break;
                                }
                            }
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (z89Var.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    ev6 ev6Var = bundle7 != null ? new ev6(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    int size2 = parcelableArrayList.size();
                                    int i7 = 0;
                                    while (i7 < size2) {
                                        Object obj2 = parcelableArrayList.get(i7);
                                        i7++;
                                        Bundle bundle8 = (Bundle) obj2;
                                        if (bundle8 == null) {
                                            yv6Var = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            yv6Var = new yv6(bundle9 != null ? new ev6(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(yv6Var);
                                    }
                                    if (f99Var.E == z89Var) {
                                        int size3 = arrayList.size();
                                        while (true) {
                                            if (i5 < size3) {
                                                Object obj3 = arrayList.get(i5);
                                                i5++;
                                                a99 a99Var3 = (a99) obj3;
                                                if (a99Var3.a() == i4) {
                                                    a99Var2 = a99Var3;
                                                }
                                            }
                                        }
                                        if (a99Var2 instanceof d99) {
                                            ((d99) a99Var2).l(ev6Var, arrayList2);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (f99Var.E == z89Var) {
                                int size4 = arrayList.size();
                                while (true) {
                                    if (i5 < size4) {
                                        Object obj4 = arrayList.get(i5);
                                        i5++;
                                        a99 a99Var4 = (a99) obj4;
                                        if (a99Var4.a() == i4) {
                                            a99Var = a99Var4;
                                        }
                                    }
                                }
                                jz7 jz7Var = f99Var.G;
                                if (jz7Var != null && (a99Var instanceof aw6)) {
                                    aw6 aw6Var = (aw6) a99Var;
                                    a05 a05Var = (a05) ((ye3) jz7Var.b).c;
                                    if (a05Var.e == aw6Var) {
                                        a05Var.i(a05Var.c(), 2);
                                    }
                                }
                                arrayList.remove(a99Var);
                                a99Var.c();
                                f99Var.r();
                                break;
                            }
                            break;
                    }
                    int i8 = f99.H;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rc() {
    }
}
