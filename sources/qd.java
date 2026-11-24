// default package

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qd extends Handler {
    public final /* synthetic */ byte a = 0;
    public WeakReference b;

    public qd(o79 o79Var) {
        this.b = new WeakReference(o79Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        tv6 tv6Var;
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
                o79 o79Var = (o79) this.b.get();
                if (o79Var != null) {
                    SparseArray sparseArray = o79Var.n;
                    u79 u79Var = o79Var.r;
                    ArrayList arrayList = u79Var.w;
                    int i2 = message.what;
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    int i5 = 0;
                    p79 p79Var = null;
                    p79 p79Var2 = null;
                    switch (i2) {
                        case 0:
                            if (i3 == o79Var.h) {
                                o79Var.h = 0;
                                if (u79Var.E == o79Var) {
                                    u79Var.q();
                                }
                            }
                            if (((r79) sparseArray.get(i3)) != null) {
                                sparseArray.remove(i3);
                                r79.a(null, null);
                                break;
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (o79Var.f == 0 && i3 == o79Var.h && i4 >= 1) {
                                    o79Var.h = 0;
                                    o79Var.f = i4;
                                    bo4 a = bo4.a(bundle);
                                    if (u79Var.E == o79Var) {
                                        u79Var.g(a);
                                    }
                                    if (u79Var.E == o79Var) {
                                        u79Var.F = true;
                                        int size = arrayList.size();
                                        while (i5 < size) {
                                            ((p79) arrayList.get(i5)).b(u79Var.E);
                                            i5++;
                                        }
                                        bv6 bv6Var = (bv6) u79Var.h;
                                        if (bv6Var != null) {
                                            o79 o79Var2 = u79Var.E;
                                            int i6 = o79Var2.d;
                                            o79Var2.d = i6 + 1;
                                            o79Var2.b(10, i6, 0, bv6Var.a, null);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                r79 r79Var = (r79) sparseArray.get(i3);
                                if (r79Var != null) {
                                    sparseArray.remove(i3);
                                    r79Var.b(bundle2);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = peekData != null ? peekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((r79) sparseArray.get(i3)) != null) {
                                    sparseArray.remove(i3);
                                    r79.a(string, bundle3);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (o79Var.f != 0) {
                                    bo4 a2 = bo4.a(bundle4);
                                    if (u79Var.E == o79Var) {
                                        u79Var.g(a2);
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
                                r79 r79Var2 = (r79) sparseArray.get(i3);
                                if (!bundle5.containsKey("routeId")) {
                                    r79Var2.getClass();
                                    r79.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                    break;
                                } else {
                                    sparseArray.remove(i3);
                                    r79Var2.b(bundle5);
                                    break;
                                }
                            }
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (o79Var.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    zu6 zu6Var = bundle7 != null ? new zu6(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    int size2 = parcelableArrayList.size();
                                    int i7 = 0;
                                    while (i7 < size2) {
                                        Object obj2 = parcelableArrayList.get(i7);
                                        i7++;
                                        Bundle bundle8 = (Bundle) obj2;
                                        if (bundle8 == null) {
                                            tv6Var = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            tv6Var = new tv6(bundle9 != null ? new zu6(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(tv6Var);
                                    }
                                    if (u79Var.E == o79Var) {
                                        int size3 = arrayList.size();
                                        while (true) {
                                            if (i5 < size3) {
                                                Object obj3 = arrayList.get(i5);
                                                i5++;
                                                p79 p79Var3 = (p79) obj3;
                                                if (p79Var3.a() == i4) {
                                                    p79Var2 = p79Var3;
                                                }
                                            }
                                        }
                                        if (p79Var2 instanceof s79) {
                                            ((s79) p79Var2).l(zu6Var, arrayList2);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (u79Var.E == o79Var) {
                                int size4 = arrayList.size();
                                while (true) {
                                    if (i5 < size4) {
                                        Object obj4 = arrayList.get(i5);
                                        i5++;
                                        p79 p79Var4 = (p79) obj4;
                                        if (p79Var4.a() == i4) {
                                            p79Var = p79Var4;
                                        }
                                    }
                                }
                                h68 h68Var = u79Var.G;
                                if (h68Var != null && (p79Var instanceof vv6)) {
                                    vv6 vv6Var = (vv6) p79Var;
                                    wz4 wz4Var = (wz4) ((pf3) h68Var.b).c;
                                    if (wz4Var.e == vv6Var) {
                                        wz4Var.i(wz4Var.c(), 2);
                                    }
                                }
                                arrayList.remove(p79Var);
                                p79Var.c();
                                u79Var.r();
                                break;
                            }
                            break;
                    }
                    int i8 = u79.H;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qd() {
    }
}
