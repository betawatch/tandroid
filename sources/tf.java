// default package

import android.os.Build;
import android.util.Log;
import j$.util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tf implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tf(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Comparator saVar;
        Comparator saVar2;
        byte b = this.a;
        byte b2 = 20;
        byte b3 = 15;
        byte b4 = 5;
        byte b5 = 10;
        byte b6 = 2;
        byte b7 = 16;
        byte b8 = 9;
        byte b9 = 1;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                j5 j5Var = (j5) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    na7.q1(j5Var.a).R3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                gl.c3(new nn6((hs) obj, tL_error, tLObject, b8));
                return;
            case 2:
                gl.c3(new nn6((bd0) obj, tL_error, tLObject, b3));
                return;
            case 3:
                gl.c3(new z20((oj0) obj, tLObject, (byte) 7));
                return;
            case 4:
                xy9 xy9Var = (xy9) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < tL_help_countriesList.countries.size(); i2++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i2);
                        String str = tL_help_country.name;
                        if (str != null) {
                            tL_help_country.default_name = str;
                        }
                        if (!tL_help_country.hidden && !tL_help_country.iso2.equalsIgnoreCase("FT")) {
                            String upperCase = tL_help_country.default_name.substring(0, 1).toUpperCase();
                            List list = (List) hashMap.get(upperCase);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap.put(upperCase, list);
                                arrayList.add(upperCase);
                            }
                            list.add(tL_help_country);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator = Collator.getInstance(k96.D0().y != null ? k96.D0().y : Locale.getDefault());
                        Objects.requireNonNull(collator);
                        saVar = new in0(collator, objArr2 == true ? 1 : 0);
                    } else {
                        saVar = new sa((byte) 9);
                    }
                    Collections.sort(arrayList, saVar);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new jn0(saVar, objArr == true ? 1 : 0));
                    }
                    gl.c3(new nn6(xy9Var, hashMap, arrayList, b2));
                    return;
                }
                return;
            case 5:
                be2 be2Var = (be2) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < tL_help_countriesList2.countries.size(); i3++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i3);
                        boolean equalsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str2 = tL_help_country2.name;
                        if (str2 != null) {
                            tL_help_country2.default_name = str2;
                        }
                        if (!tL_help_country2.hidden || equalsIgnoreCase) {
                            if (equalsIgnoreCase) {
                                String M0 = k96.M0(2131750504, null);
                                tL_help_country2.default_name = M0;
                                tL_help_country2.name = M0;
                            }
                            String upperCase2 = tL_help_country2.default_name.substring(0, 1).toUpperCase();
                            List list2 = (List) hashMap2.get(upperCase2);
                            if (list2 == null) {
                                list2 = new ArrayList();
                                hashMap2.put(upperCase2, list2);
                                arrayList2.add(upperCase2);
                            }
                            list2.add(tL_help_country2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator2 = Collator.getInstance(k96.D0().y != null ? k96.D0().y : Locale.getDefault());
                        Objects.requireNonNull(collator2);
                        saVar2 = new in0(collator2, objArr3 == true ? 1 : 0);
                    } else {
                        saVar2 = new sa((byte) 9);
                    }
                    Collections.sort(arrayList2, saVar2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new jn0(saVar2, b9));
                    }
                    gl.c3(new nn6((Object) be2Var, (Object) hashMap2, (Object) arrayList2, (byte) 23));
                    return;
                }
                return;
            case 6:
                gl.c3(new z20((zs0) obj, tLObject, b7));
                return;
            case 7:
                gl.c3(new z20((at0) obj, tLObject, (byte) 17));
                return;
            case 8:
                gl.c3(new q21((p31) obj, tLObject, b9));
                return;
            case 9:
                y31 y31Var = (y31) obj;
                y31Var.getClass();
                gl.c3(new fv0(y31Var, tL_error, tLObject, b4));
                return;
            case 10:
                gl.c3(new fv0(obj, (Object) tL_error, (Object) tLObject, (byte) 12));
                return;
            case 11:
                gl.c3(new kx1((s12) obj, tL_error, b5));
                return;
            case 12:
                gl.c3(new hq1((m82) obj, b2));
                return;
            case 13:
                gl.c3(new n92((x92) obj, tLObject, b9));
                return;
            case 14:
                kf2 kf2Var = (kf2) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    kf2Var.getMessagesController().R3(updates, false);
                    if (updates.chats.isEmpty()) {
                        return;
                    }
                    gl.d3(new n92(kf2Var, updates, b7), 1000L);
                    return;
                }
                return;
            case 15:
                it2 it2Var = (it2) obj;
                it2Var.getClass();
                gl.c3(new ws2(it2Var, b6));
                return;
            case 16:
                gl.c3(new gu2((f13) obj, tLObject, b3));
                return;
            case 17:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                dataSettingsActivity.getClass();
                gl.c3(new i63(dataSettingsActivity, objArr4 == true ? 1 : 0));
                return;
            case 18:
                gl.c3(new wc3((uj3) obj, tLObject, b8));
                return;
            case 19:
                mt9 mt9Var = (mt9) obj;
                mt9Var.getClass();
                gl.c3(new wc3(mt9Var, tLObject, (byte) 11));
                return;
            case 20:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<T> arrayList4 = ((Vector) tLObject).objects;
                    int size = arrayList4.size();
                    while (i < size) {
                        Object obj2 = arrayList4.get(i);
                        i++;
                        if (obj2 instanceof TLRPC.TL_transcriptionModel) {
                            TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj2;
                            if (tL_transcriptionModel.document instanceof TLRPC.TL_document) {
                                arrayList3.add(tL_transcriptionModel);
                            }
                        }
                    }
                    synchronized (zm3.class) {
                        zm3.a = arrayList3;
                        zm3.k(arrayList3);
                    }
                    Log.d("Dictation", "speech models: " + arrayList3.size() + " from the server");
                    DictationAsr.R();
                    DictationAsr.n();
                } else {
                    ir2.x(new StringBuilder("speech models: list failed: "), tL_error != null ? tL_error.text : null, "Dictation");
                }
                synchronized (zm3.class) {
                    zm3.c = null;
                }
                countDownLatch.countDown();
                return;
            case 21:
                gl.c3(new ee2((up3) obj, tLObject, b6));
                return;
            case 22:
                gl.c3(new eu3((lv3) obj, tLObject, b6));
                return;
            case 23:
                gl.c3(new eu3((pz3) obj, tLObject, b4));
                return;
            case 24:
                y04 y04Var = (y04) obj;
                if (tLObject != null) {
                    gl.c3(new eu3(y04Var, tLObject, b5));
                    return;
                }
                return;
            case 25:
                l94 l94Var = (l94) obj;
                if (tL_error != null) {
                    l94Var.h(0, false);
                    return;
                }
                if (tLObject instanceof Vector) {
                    l94Var.E0 = false;
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (l94Var.q0 == null) {
                            l94Var.q0 = new HashMap();
                        }
                        for (int i4 = 0; i4 < vector.objects.size(); i4++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i4);
                            l94Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    for (int i5 = 0; i5 < l94Var.I0.size(); i5++) {
                        k94 k94Var = (k94) l94Var.I0.get(i5);
                        if (l94Var.M != null || l94Var.a0 == k94Var.e) {
                            l94Var.I0.remove(i5);
                            if (l94Var.k(k94Var, null)) {
                                return;
                            }
                            TLRPC.TL_upload_file tL_upload_file = k94Var.f;
                            if (tL_upload_file != null) {
                                tL_upload_file.disableFree = false;
                                tL_upload_file.freeResources();
                                return;
                            }
                            TLRPC.TL_upload_webFile tL_upload_webFile = k94Var.g;
                            if (tL_upload_webFile != null) {
                                tL_upload_webFile.disableFree = false;
                                tL_upload_webFile.freeResources();
                                return;
                            }
                            TLRPC.TL_upload_cdnFile tL_upload_cdnFile = k94Var.h;
                            if (tL_upload_cdnFile != null) {
                                tL_upload_cdnFile.disableFree = false;
                                tL_upload_cdnFile.freeResources();
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 26:
                gl.c3(new mg3((cd4) obj, tL_error, tLObject, (byte) 27));
                return;
            case 27:
                df4 df4Var = (df4) obj;
                if (df4Var != null) {
                    gl.c3(df4Var);
                    return;
                }
                return;
            case 28:
                gl.c3(new ns2((i8c) obj, tLObject, tL_error, b9));
                return;
            default:
                gl.c3(new vc4((tz4) obj, tLObject, b7));
                return;
        }
    }
}
