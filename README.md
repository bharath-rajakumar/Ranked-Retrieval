Ranked-Retrieval
================

To implement a simple statistical retrieval system, using the inverted list index

###Compilation
---
```
javac Main.java

java Main.java path/to/cranfield/folder path/to/hw3.queries
```


###Questions
---
1. Documents should be presented in ranked order of the total scores. (50 points: 25 points per weighting scheme). For each query, turn in the indexed form of the query, and the top 10 documents for the query under both weighting schemes (you may build two different systems if you think
that's simpler). Indicate the rank, score, external document identifier, and headline, for each of the top 10 documents for each query. 

```
Q1
[aeroelast, aircraft, construct, heat, high, law, model, must, obei, similar, speed]
Rank	DocId	W1				Title
=====================================================================================
10		575		1.4815755961935289	atomic recombination in a hypersonic wind tunnel nozzle .
9		877		1.4968557712607653	the influence of aerodynamic heating on the flexuralrigidity of a thin wing .
8		1146		1.5108390794664905	thermal buckling of cylinders .
7		791		1.5143636770702151	measurements at mach numbers up to 2. 8 of the longitudinalcharacteristics of one plane and three cambered slender'ogee' wings .
6		13		1.5418476003808441	similarity laws for stressing heated wings .
5		11		1.5512928009385745	similar solutions in compressible laminar free mixingproblems .
4		572		1.6496645142934645	boundary layer displacement and leading edge bluntness effects in hightemperature hypersonic flow .
3		328		1.819759164653773	the boundary layer near the stagnation point in hypersonicflow past a sphere .
2		485		1.9037337658743234	linear heat flow in a composite slab .
1		50		2.0210055047995685	investigation of laminar boundary layer in compressiblefluids using the crocco method .

Rank	DocId	W2				Title
=====================================================================================
10		878		4.744779119785212	experimental model techniques and equipment for flutterinvestigations .
9		140		4.748212128777634	the determination of turbulent skin friction by meansof pitot tubes .
8		12		4.755379969491978	some structural and aerelastic considerations of highspeed flight .
7		943		4.767968884083418	compressible free shear layer with finite initial thickness .
6		745		4.776313264340924	an automatic method for finding the greatest or leastvalue function .
5		11		4.880550254969336	similar solutions in compressible laminar free mixingproblems .
4		877		4.883539958730529	the influence of aerodynamic heating on the flexuralrigidity of a thin wing .
3		572		4.88584292237165	boundary layer displacement and leading edge bluntness effects in hightemperature hypersonic flow .
2		485		4.972999326684961	linear heat flow in a composite slab .
1		50		5.071760162605258	investigation of laminar boundary layer in compressiblefluids using the crocco method .

Q2
[aeroelast, aircraft, associ, flight, high, problem, speed, structur]
Rank	DocId	W1				Title
=====================================================================================
10		1146		1.1662144718049918	thermal buckling of cylinders .
9		1168		1.1814956634198852	damage incurred on a tilt-wing multipropeller vtol/stolaircraft operating over a level, gravel-covered surface .
8		1379		1.2104005989939197	hypersonic flight and the re-entry problem .
7		171		1.2174401705170905	a low density wind tunnel study of shock wave structureand relaxation phenomena in gases .
6		99		1.2735417725542342	the fundamentals of the statistical theory of turbulence .
5		791		1.283054374915977	measurements at mach numbers up to 2. 8 of the longitudinalcharacteristics of one plane and three cambered slender'ogee' wings .
4		13		1.3040737935109843	similarity laws for stressing heated wings .
3		745		1.32085723950577	an automatic method for finding the greatest or leastvalue function .
2		50		1.3773080252724375	investigation of laminar boundary layer in compressiblefluids using the crocco method .
1		11		1.7545875663473076	similar solutions in compressible laminar free mixingproblems .

Rank	DocId	W2				Title
=====================================================================================
10		883		3.536959262486678	correlated fatigue data for aircraft structural joints .
9		809		3.5376990802494053	an investigation of the influence of lift on sonic-boomintensity by means of wind tunnel measurements of thepressure fields of several wing-body combinations ata mach number of 2. 01 .
8		171		3.55031349659543	a low density wind tunnel study of shock wave structureand relaxation phenomena in gases .
7		833		3.5640382119254252	a simple method of matric structural analysis, partiv, non-linear problems .
6		1088		3.579461712203823	iterative methods for solving partial difference equations of elliptictype .
5		1168		3.5856122921759592	damage incurred on a tilt-wing multipropeller vtol/stolaircraft operating over a level, gravel-covered surface .
4		99		3.596906070496974	the fundamentals of the statistical theory of turbulence .
3		745		3.6785351918662665	an automatic method for finding the greatest or leastvalue function .
2		50		3.6845863951890503	investigation of laminar boundary layer in compressiblefluids using the crocco method .
1		11		3.9584327553268275	similar solutions in compressible laminar free mixingproblems .

Q3
[composit, conduct, far, heat, problem, slab, solv]
Rank	DocId	W1				Title
=====================================================================================
10		343		1.104275482556897	transpiration cooling experiments in a turbulent boundarylayer at m=3 .
9		578		1.1764152931184266	dissociation scaling for nonequilibrium blunt nose flows .
8		398		1.1823012569552132	heat transfer in turbulent shear flow .
7		541		1.1927128316384479	similitude of hypersonic flows over slender bodiesin non-equilibrium dissociated gases .
6		1071		1.2448968061905348	stability of thin torispherical shells under uniforminternal pressure .
5		89		1.2675782579940693	an investigation of separated flows, part i: the pressurefield .
4		90		1.3240958691835822	periodic temperature distributions in a two-layer compositeslab .
3		4		1.3546468525332116	approximate solutions of the incompressible laminarboundary layer equations for a plate in shear flow .
2		484		1.4928588639708105	the influence of two-dimensional stream shear for airfoilmaximum lift .
1		143		1.549887944036065	interplanetary orbits .

Rank	DocId	W2				Title
=====================================================================================
10		5		3.1542823097273525	one-dimensional transient heat conduction into a double-layerslab subjected to a linear heat input for a small timeinternal .
9		578		3.1610258647723093	dissociation scaling for nonequilibrium blunt nose flows .
8		541		3.1648669352848375	similitude of hypersonic flows over slender bodiesin non-equilibrium dissociated gases .
7		180		3.2508984828867016	boundary layer over a flat plate in presence of shearflow .
6		90		3.275260008118298	periodic temperature distributions in a two-layer compositeslab .
5		89		3.2801807604283693	an investigation of separated flows, part i: the pressurefield .
4		398		3.3278526728919644	heat transfer in turbulent shear flow .
3		143		3.428166537816893	interplanetary orbits .
2		4		3.447111640124256	approximate solutions of the incompressible laminarboundary layer equations for a plate in shear flow .
1		484		3.473147382667907	the influence of two-dimensional stream shear for airfoilmaximum lift .

Q4
[assumpt, base, can, chemic, criterion, develop, empir, equilibrium, flow, ga, instantan, local, mixtur, react, show, simplifi, solut, valid]
Rank	DocId	W1				Title
=====================================================================================
10		574		2.181783643477969	inviscid flow with nonequilibrium molecular dissociation for pressuredistributions encountered in hypersonic flight .
9		109		2.1931579906408847	the production of uniform shear flow in a wind tunnel .
8		1314		2.2203220373317367	production of high temperature gases in shock tubes .
7		575		2.2563040160440715	atomic recombination in a hypersonic wind tunnel nozzle .
6		23		2.2640916139976532	skin-friction and heat transfer characteristics ofa laminar boundary layer on a cylinder in axial incompressibleflow .
5		487		2.2737904442900736	theory for supersonic two-dimensional, laminar, base-typeflows using the crocco-lees mixing concepts .
4		328		2.2865037584399643	the boundary layer near the stagnation point in hypersonicflow past a sphere .
3		184		2.455629046650808	scale models for thermo-aeroelastic research .
2		1060		2.490122216036187	buckled states of circular plates .
1		165		2.562025470067713	skin-friction measurements in incompressible flow.

Rank	DocId	W2				Title
=====================================================================================
10		1084		7.698780961592317	the flow past circular cylinders at low speeds .
9		1254		7.703742704100356	combustion in the boundary layer on a porous surface .
8		1188		7.729908120400597	factors affecting lift-drag ratios at mach numbersfrom 5 to 20 .
7		184		7.743080240034547	scale models for thermo-aeroelastic research .
6		166		7.755614849227158	flow of chemically reacting gas mixtures .
5		1314		7.759882263363301	production of high temperature gases in shock tubes .
4		1060		7.770950462952949	buckled states of circular plates .
3		1274		7.801790920904382	real gas effects in flow over blunt bodies at hypersonic speeds .
2		487		7.898998981665066	theory for supersonic two-dimensional, laminar, base-typeflows using the crocco-lees mixing concepts .
1		165		7.9159867246106295	skin-friction measurements in incompressible flow.

Q5
[aerodynam, applic, chemic, hyperson, kinet, problem, system]
Rank	DocId	W1				Title
=====================================================================================
10		328		0.9589459738956383	the boundary layer near the stagnation point in hypersonicflow past a sphere .
9		942		1.0128759771771911	secondary gas injection in a conical rocket nozzle .
8		967		1.0172400076604438	a study of laminar compressible viscous pipe flow accelerated by anaxial body force, with application to magnetogasdynamics .
7		1031		1.0475795009449285	note on creep buckling of columns .
6		162		1.0574824921360881	nearly circular transfer trajectories for descendingsatellites .
5		1295		1.0628589401062105	recent advances in nonequilibrium dissociating gasdynamics .
4		624		1.1234039346481806	cruise performance of channel-flow ground effect machines .
3		551		1.15225702582802	analysis of a loaded cantilever plate by finite differencemethods .
2		102		1.2247426582913854	advantages and limitations of models .
1		400		1.270897696780856	buckling stress of clamped rectangular plates in shear .

Rank	DocId	W2				Title
=====================================================================================
10		487		3.0790769890775094	theory for supersonic two-dimensional, laminar, base-typeflows using the crocco-lees mixing concepts .
9		624		3.086421609605273	cruise performance of channel-flow ground effect machines .
8		354		3.087044699859668	laminar heat-transfer and pressure measurements over blunt-nosedcones at large angle of attack .
7		1295		3.139511295223245	recent advances in nonequilibrium dissociating gasdynamics .
6		942		3.1401895387543677	secondary gas injection in a conical rocket nozzle .
5		967		3.142946368879567	a study of laminar compressible viscous pipe flow accelerated by anaxial body force, with application to magnetogasdynamics .
4		551		3.154144635139973	analysis of a loaded cantilever plate by finite differencemethods .
3		400		3.1665331539210038	buckling stress of clamped rectangular plates in shear .
2		1031		3.1992131655252907	note on creep buckling of columns .
1		102		3.2507777447072135	advantages and limitations of models .

Q6
[behaviour, couett, experiment, flow, guid, theoret, turbul]
Rank	DocId	W1				Title
=====================================================================================
10		1074		0.9076118207654419	theoretical and experimental investigation of second-order supersonicwing-body interference .
9		405		0.9153809902064346	tables of thermal properties of gases .
8		766		0.9360749990988888	experimental investigation at mach number of 3. 0 ofeffects of thermal stress and buckling on flutter characteristicsof flat single-bay panels of length-width ratio 0. 96 .
7		521		0.9387832534222307	a note on application of transonic linearization toan airfoil with a round leading edge .
6		639		0.9498333293296458	analytical study of the tumbling motions of vehiclesentering planetary atmospheres .
5		314		0.9516925579705862	simplified method for determination of the criticalheight of distributed roughness particles for boundarylayer transition at mach numbers from 0 to 5.
4		98		0.9738236211106428	heat transfer by laminar flow to a rotating plate .
3		256		0.9985929791030865	an experimental study of the glancing interaction betweena shock wave and a turbulent boundary layer .
2		490		1.0969896533450556	normal-shock relations in magnetohydrodynamics .
1		797		1.117335940167127	a study of the effect of leading-edge modifications on the flow overa 50degree sweptback wing at transonic speeds .

Rank	DocId	W2				Title
=====================================================================================
10		882		3.016213557654629	the variation of gust frequency with gust velocityand altitude .
9		1074		3.0176221662547302	theoretical and experimental investigation of second-order supersonicwing-body interference .
8		1362		3.0184919795516247	non-linear analysis of heated, cambered wings by the matrix forcemethod .
7		98		3.0233606406259153	heat transfer by laminar flow to a rotating plate .
6		766		3.0235935106239262	experimental investigation at mach number of 3. 0 ofeffects of thermal stress and buckling on flutter characteristicsof flat single-bay panels of length-width ratio 0. 96 .
5		1195		3.024256705758158	experiments with two-dimensional, transversely impinging
4		141		3.0291737036477935	free-flight techniques for high speed aerodynamic research .
3		405		3.0319282981409046	tables of thermal properties of gases .
2		256		3.064744572439907	an experimental study of the glancing interaction betweena shock wave and a turbulent boundary layer .
1		490		3.2027994797725725	normal-shock relations in magnetohydrodynamics .

Q7
[angl, attack, avail, distribut, equival, forebodi, lower, ogiv, possibl, pressur, relat, surfac, zero]
Rank	DocId	W1				Title
=====================================================================================
10		1230		1.7435682902918128	hypersonic nozzle expansion of air with atom recombinationpresent .
9		233		1.802234967236577	the theoretical wave drag of some bodies of revolution .
8		231		1.817306519460295	practical calculation of second-order supersonic flowpast non-lifting bodies of revolution .
7		55		1.8637606516116259	separation, stability and other properties of compressiblelaminar boundary layer with pressure gradient and heattransfer .
6		123		1.8696399949746625	the downstream influence of mass transfer at the noseof a slender cone .
5		121		1.8837883370526944	a theory for base pressures in transonic and supersonicflow .
4		56		1.8869429190472666	an analysis of the applicability of the hypersonicsimilarity law to the study of the flow about bodiesof revolution at zero angle of attack .
3		372		1.886999825499816	an experimental investigation of flow about simpleblunt bodies at a nominal mach number of 5. 8.
2		1039		1.9744229396522734	on transverse vibrations of thin, shallow elastic shells .
1		491		2.286718905268817	on the close relationship between turbulent plane-couetteand pressure flows .

Rank	DocId	W2				Title
=====================================================================================
10		433		5.635023248940543	application of two dimensional vortex theory to theprediction of flow fields behind wings of wing-bodycombinations at subsonic and supersonic speeds .
9		247		5.6381404025935	the calculation of the pressure distribution on thickwings of small aspect ratio at zero lift in subsonicflow .
8		372		5.642189126334843	an experimental investigation of flow about simpleblunt bodies at a nominal mach number of 5. 8.
7		231		5.693298738302273	practical calculation of second-order supersonic flowpast non-lifting bodies of revolution .
6		1230		5.711073693319771	hypersonic nozzle expansion of air with atom recombinationpresent .
5		123		5.7281130571372065	the downstream influence of mass transfer at the noseof a slender cone .
4		121		5.734220790540943	a theory for base pressures in transonic and supersonicflow .
3		55		5.737896383508758	separation, stability and other properties of compressiblelaminar boundary layer with pressure gradient and heattransfer .
2		56		5.787152892079671	an analysis of the applicability of the hypersonicsimilarity law to the study of the flow about bodiesof revolution at zero angle of attack .
1		491		6.2563521935385005	on the close relationship between turbulent plane-couetteand pressure flows .

Q8
[angl, approxim, attack, avail, bodi, dash, exact, method, predict, present, pressur]
Rank	DocId	W1				Title
=====================================================================================
10		231		1.3503027411859065	practical calculation of second-order supersonic flowpast non-lifting bodies of revolution .
9		1103		1.36519246330212	pressures, densities and temperatures in the upper atmosphere .
8		946		1.375412691822465	exploratory investigation of the effect of a forwardfacing jet on the bow shock of a blunt body in a machnumber 6 free stream .
7		68		1.3781894580533176	some aspects of air-helium simulation and hypersonicapproximations .
6		491		1.3980631590723342	on the close relationship between turbulent plane-couetteand pressure flows .
5		1230		1.4395824337760963	hypersonic nozzle expansion of air with atom recombinationpresent .
4		432		1.4512704620812316	theoretical damping in roll and rolling moment dueto differential wing incidence for slender cruciformwings and wing-body combinations .
3		233		1.4951604325646597	the theoretical wave drag of some bodies of revolution .
2		687		1.5114068657239135	oscillating airfoils at high mach number .
1		121		1.6704743978898908	a theory for base pressures in transonic and supersonicflow .

Rank	DocId	W2				Title
=====================================================================================
10		442		4.809771598023992	some effects of variations in several parameters includingfluid density on the flutter speed of light uniformcantilever wings .
9		123		4.812814939395784	the downstream influence of mass transfer at the noseof a slender cone .
8		231		4.834889552778989	practical calculation of second-order supersonic flowpast non-lifting bodies of revolution .
7		233		4.866215456105774	the theoretical wave drag of some bodies of revolution .
6		247		4.871819571047898	the calculation of the pressure distribution on thickwings of small aspect ratio at zero lift in subsonicflow .
5		1230		4.891504318227706	hypersonic nozzle expansion of air with atom recombinationpresent .
4		68		4.899344703933435	some aspects of air-helium simulation and hypersonicapproximations .
3		687		4.904616201738051	oscillating airfoils at high mach number .
2		491		4.996530915412945	on the close relationship between turbulent plane-couetteand pressure flows .
1		121		5.003103711886502	a theory for base pressures in transonic and supersonicflow .

Q9
[flow, heat, intern, paper, slip, studi, transfer]
Rank	DocId	W1				Title
=====================================================================================
10		100		0.8815818726417152	vibration isolation of aircraft power plants .
9		1203		0.8901461244296994	the propagation of a nonuniform magnetohydrodynamicshock wave into a moving monatomic fluid .
8		101		0.9104231855332361	laminar heat transfer over blunt-nosed bodies at hypersonic flightspeeds .
7		269		0.912197929030256	on a laminar free-convection flow and heat transferof electrically conducting fluid on a vertical flatplate in the presence of a transverse magnetic field .
6		1214		0.9465860451078582	the drag of elongated bodies over a wide reynolds numberrange .
5		21		0.9663177825915592	on heat transfer in slip flow .
4		305		1.0026916871715341	hypersonic strong viscous interaction on a flat platewith surface mass transfer .
3		20		1.0255284490384455	generalised-newtonian theory .
2		570		1.0304332538164007	on the boundary layer equations in hypersonic flowand their approximate solutions .
1		44		1.12468897172018	tip-bluntness effects on cone pressures at m=6.85.

Rank	DocId	W2				Title
=====================================================================================
10		982		3.088025048553193	the temperature history in a thick skin subjected to laminar heatingduring entry into the atmosphere .
9		397		3.0907747267729864	a sublayer for fluid injection into the incompressibleturbulent boundary layer .
8		269		3.0950173017200155	on a laminar free-convection flow and heat transferof electrically conducting fluid on a vertical flatplate in the presence of a transverse magnetic field .
7		1214		3.149895992429432	the drag of elongated bodies over a wide reynolds numberrange .
6		570		3.164558112096077	on the boundary layer equations in hypersonic flowand their approximate solutions .
5		101		3.1657246096851837	laminar heat transfer over blunt-nosed bodies at hypersonic flightspeeds .
4		305		3.179651853983393	hypersonic strong viscous interaction on a flat platewith surface mass transfer .
3		21		3.183248396259884	on heat transfer in slip flow .
2		20		3.231341557024167	generalised-newtonian theory .
1		44		3.2440758392838145	tip-bluntness effects on cone pressures at m=6.85.

Q10
[air, avail, densiti, enthalpi, over, properti, rang, realga, transport, wide]
Rank	DocId	W1				Title
=====================================================================================
10		1263		1.421437792822008	turbulent heat transfer through a highly cooled, partiallydissociated boundary layer .
9		109		1.4217462232728522	the production of uniform shear flow in a wind tunnel .
8		1213		1.4311582482036356	heat transfer to slender cones in hypersonic flow,including effects of yaw and nose bluntness .
7		1312		1.43424346541573	tabulated solutions of the equilibrium gas propertiesbehind the incidents and reflected normal shock-wavein a shock-tube .
6		271		1.4822780683073475	an experimental test of compressibility transformationfor turbulent boundary layer .
5		1198		1.4947123182141233	the blunt-leading-edge problem in hypersonic flow .
4		328		1.511764242706071	the boundary layer near the stagnation point in hypersonicflow past a sphere .
3		948		1.62391476565998	panel flutter tests on full scale x-15 lower verticalstabilizer at mach number of 3. 0.
2		301		1.8096164267203287	approximate design of sharp-cornered supersonic nozzles .
1		492		2.0360650114081094	prediction of ogive-forebody pressures at angles of attack .

Rank	DocId	W2				Title
=====================================================================================
10		1198		4.3945634471800545	the blunt-leading-edge problem in hypersonic flow .
9		615		4.400478462181692	the contraction of satellite orbits under the influence of air drag .part iii . high eccentricity orbits . /0.2 e 1/
8		404		4.402925912175689	two dimensional transonic flow past airfoils .
7		435		4.408293552395691	application of similar solutions to calculations oflaminar heat transfer on bodies with yaw and largepressure gradients in high speed flow .
6		690		4.429063660714238	investigaion of the flow over a spiked-nose hemispherecylinder at a mach number of 6. 8.
5		1009		4.42953724624518	free-flight measurements of the static and dynamic
4		523		4.476102481034295	approximate determination of position of the sonicline for a blunt body in hypersonic flow .
3		948		4.568627171050642	panel flutter tests on full scale x-15 lower verticalstabilizer at mach number of 3. 0.
2		492		4.64045734788842	prediction of ogive-forebody pressures at angles of attack .
1		301		4.669590754064843	approximate design of sharp-cornered supersonic nozzles .

Q11
[analyt, approxim, blast, find, newtonian, possibl, problem, similar, solut, strong, wave]
Rank	DocId	W1				Title
=====================================================================================
10		27		1.4057641996264452	newtonian flow theory for slender bodies .
9		1374		1.4216284097556677	theoretical analysis of turbulent mixing of reactivegases with application to supersonic combustion ofhydrogen .
8		1247		1.4235903964350027	the supersonic boom of a projectile related to dragand volume .
7		1309		1.4286362466395945	hypersonic flows past a yawed circular cone and otherpointed bodies .
6		1279		1.4377180054823864	sublimation in a hypersonic environment .
5		1355		1.483255162177467	boundary layer displacement effects in air at machnumbers of 6. 8 and 9. 6.
4		555		1.5152788773056793	closing reply to comments on generalized heat transferformulas and graphs for nose cone re-entry into theatmosphere .
3		24		1.5651341051714878	theory of stagnation point heat transfer in dissociatedair .
2		71		1.5752641622196994	laminar boundary layer behind shock advancing intostationary fluid .
1		494		2.1587634855061713	axisymmetric viscous flow plast very slender bodiesof revolution .

Rank	DocId	W2				Title
=====================================================================================
10		737		4.759336252410654	on the analysis of elastic plates of variable thickness .
9		304		4.7735765743001615	first-order approach to a strong interaction problemin hypersonic flow over an insulated flat plate .
8		27		4.790920409748949	newtonian flow theory for slender bodies .
7		1326		4.799871220319405	interaction of secondary injectants and rocket exhaustfor thrust vector control .
6		1185		4.805214309595533	an integral method for calculating heat and mass transferin laminar boundary layers .
5		71		4.817799863172594	laminar boundary layer behind shock advancing intostationary fluid .
4		471		4.836956027155015	
3		653		4.841124383847436	transient magnetohydrodynamic duct flow .
2		555		4.865764543919996	closing reply to comments on generalized heat transferformulas and graphs for nose cone re-entry into theatmosphere .
1		494		5.258761018079255	axisymmetric viscous flow plast very slender bodiesof revolution .

Q12
[aerodynam, calcul, can, channel, effect, flow, ground, machin, perform]
Rank	DocId	W1				Title
=====================================================================================
10		940		1.0566753094784342	of a turbulent free shear layer .
9		269		1.067635541764262	on a laminar free-convection flow and heat transferof electrically conducting fluid on a vertical flatplate in the presence of a transverse magnetic field .
8		324		1.073327472733932	vorticity effect on the stagnation point flow of a viscous incompressiblefluid .
7		1208		1.0828975014965054	a linearized analysis of the forces exerted on a rigidwing by a shock wave .
6		1163		1.115157811278253	force-test investigation of the stability and controlcharacteristics of a scale model of a tilt-wing verticaltake-off and landing aircraft .
5		791		1.147919347219214	measurements at mach numbers up to 2. 8 of the longitudinalcharacteristics of one plane and three cambered slender'ogee' wings .
4		328		1.1583437277518374	the boundary layer near the stagnation point in hypersonicflow past a sphere .
3		703		1.2555253526909758	general airfoil theory .
2		965		1.3040532329198071	analytic determination of discharge coefficients of flow nozzles .
1		623		1.3662120976374792	on the coupling between heat and mass transfer .

Rank	DocId	W2				Title
=====================================================================================
10		1222		3.883408534664898	axisymmetric magnetohydrodynamic channel flow .
9		542		3.888427614590916	biot's variational principle in heat conduction .
8		1163		3.892936720395869	force-test investigation of the stability and controlcharacteristics of a scale model of a tilt-wing verticaltake-off and landing aircraft .
7		1231		3.9030073386509287	hypersonic flow over an elliptic cone: theory and experiment .
6		940		3.922949850030841	of a turbulent free shear layer .
5		1220		3.9279912037283005	boundary layer transition in the presence of streamwisevortices .
4		703		3.929326544374963	general airfoil theory .
3		649		3.980896892305287	the hovercraft - a new concept in maritime transport .
2		965		4.003737086124721	analytic determination of discharge coefficients of flow nozzles .
1		623		4.021521090974879	on the coupling between heat and mass transfer .

Q13
[aileron, basic, buzz, mechan, transon]
Rank	DocId	W1				Title
=====================================================================================
10		800		0.9297189055149366	wall interference at transonic speeds on a hemisphere cylinder model .
9		926		0.9648923120278163	post buckling behaviour of circular cylinderical shellsunder hydrostatic pressure .
8		659		1.0078806893489949	nonuniform shear flow past cylinders .
7		1267		1.0263476335510242	on supersonic flow past thick airfoils .
6		642		1.0276058383501832	the buckling strength of a uniform circular cylinderloaded in axial compression .
5		796		1.0483043718734089	an investigation at transonic speeds of the performance of variousdistributed roughness bands used to cause boundary layer transitionnear the leading edge of a cropped delta half-wing .
4		198		1.1765315381204489	investigation of a systematic group of naca 1 - seriescowlings with and without spinners .
3		519		1.2368432797007685	base pressure at supersonic speeds in the presenceof a supersonic jet .
2		902		1.3487854115503817	some current and proposed investigations into the flowfor slender delta and other wings in unsteady motion .
1		495		1.9492485391222285	on similar solutions for strong blast waves and theirapplication to steady hypersonic flow .

Rank	DocId	W2				Title
=====================================================================================
10		414		2.210587126876803	the problem of resistance in compressible fluids .
9		879		2.250242997880338	flutter model testing at transonic speeds .
8		198		2.2678337144251794	investigation of a systematic group of naca 1 - seriescowlings with and without spinners .
7		439		2.270643056062465	a factor affecting transonic leading edge flow separation .
6		37		2.273532153991475	a new technique for investigating heat transfer andsurface phenomena under hypersonic flow conditions .
5		642		2.2960066800500076	the buckling strength of a uniform circular cylinderloaded in axial compression .
4		312		2.2976465276959703	chordwise pressure distributions over several naca16 series airfoils at transonic mach numbers up to1.25 .
3		519		2.341877133794677	base pressure at supersonic speeds in the presenceof a supersonic jet .
2		902		2.392899610044409	some current and proposed investigations into the flowfor slender delta and other wings in unsteady motion .
1		495		2.773812271914124	on similar solutions for strong blast waves and theirapplication to steady hypersonic flow .

Q14
[interact, paper, shocksound, wave]
Rank	DocId	W1				Title
=====================================================================================
10		63		0.5147250905906899	hypersonic viscous flow over slender cones .
9		290		0.5168530999954914	dynamic stability of a missile in rolling flight .
8		334		0.5321847518770133	influence of the leading-edge shock wave on the laminar boundary layerat hypersonic speeds .
7		568		0.545448340185964	shock wave effects on the laminar skin friction ofan insulated flat plate at hypersonic speeds .
6		1363		0.5827173628418603	a characteristic type of instability in the large deflectionsof elastic plates .
5		438		0.5866944942951707	stagnation point heat transfer measurements at supersatellite speeds .
4		255		0.5979140552087814	an approximate solution of the turbulent boundary layerequations in incompressible and compressible .
3		344		0.6019224972665207	some experimental techniques in mass transfer cooling .
2		169		0.6713362548358175	on the sudden contact between a hot gas and a cold solid .
1		797		0.7527673514438012	a study of the effect of leading-edge modifications on the flow overa 50degree sweptback wing at transonic speeds .

Rank	DocId	W2				Title
=====================================================================================
10		568		1.4007585714660378	shock wave effects on the laminar skin friction ofan insulated flat plate at hypersonic speeds .
9		63		1.4208400632925073	hypersonic viscous flow over slender cones .
8		290		1.4243933714247086	dynamic stability of a missile in rolling flight .
7		1363		1.4393631743797886	a characteristic type of instability in the large deflectionsof elastic plates .
6		344		1.4400842392494342	some experimental techniques in mass transfer cooling .
5		334		1.4454741890035248	influence of the leading-edge shock wave on the laminar boundary layerat hypersonic speeds .
4		438		1.4526920646979056	stagnation point heat transfer measurements at supersatellite speeds .
3		255		1.4620921469313757	an approximate solution of the turbulent boundary layerequations in incompressible and compressible .
2		797		1.4696673134421812	a study of the effect of leading-edge modifications on the flow overa 50degree sweptback wing at transonic speeds .
1		169		1.4837752942847933	on the sudden contact between a hot gas and a cold solid .

Q15
[materi, photoelast, properti]
Rank	DocId	W1				Title
=====================================================================================
10		1126		0.6486160983702128	an engineer's conceptual approach to the buckling ofcylindrical shell (axial loading) .
9		1339		0.6486160983702128	calculation of flutter characteristics for finite-span swept or unsweptwings at subsonic and supersonic speeds by a modified strip analysis .
8		1023		0.6486160983702128	note on creep buckling of columns .
7		1096		0.6744367051652367	qualitative measurements of the effective heats ofablation of several materials in supersonic air jetsat stagnation temperature up to 11,000 f.
6		1042		0.7026461166289556	on transverse vibrations of thin, shallow elastic shells .
5		541		0.7382314831189778	similitude of hypersonic flows over slender bodiesin non-equilibrium dissociated gases .
4		462		0.745676274734272	photo-thermoelasticity .
3		1024		0.7775919676757853	note on creep buckling of columns .
2		81		0.7849193572063531	compressible laminar flow and heat transfer about arotating isothermal disk .
1		461		1.1171286145042556	approximate methods fore predicting separation propertiesof laminar boundary layers .

Rank	DocId	W2				Title
=====================================================================================
10		816		1.3945451520493253	experimental investigation at a mach number of 3. 11of the lift, drag and pitching moment characteristicsof a number of blunt low-fineness-ratio bodies .
9		1064		1.4063886047951426	propeller slipstream effects as determined from wingpressure distribution on a large-scale six-propellervtol model at static thrust .
8		1339		1.4215450044769515	calculation of flutter characteristics for finite-span swept or unsweptwings at subsonic and supersonic speeds by a modified strip analysis .
7		1042		1.42376755009316	on transverse vibrations of thin, shallow elastic shells .
6		541		1.429000600910546	similitude of hypersonic flows over slender bodiesin non-equilibrium dissociated gases .
5		81		1.430826436705995	compressible laminar flow and heat transfer about arotating isothermal disk .
4		1098		1.448751143958053	an experimental investigation of ablating materialat low and high enthalpy potentials .
3		1024		1.4589002312783064	note on creep buckling of columns .
2		462		1.4800736231979241	photo-thermoelasticity .
1		461		1.6817025601709907	approximate methods fore predicting separation propertiesof laminar boundary layers .

Q16
[about, bodi, calcul, can, comput, effici, electron, flow, potenti, revolut, transvers]
Rank	DocId	W1				Title
=====================================================================================
10		409		1.316688892450237	on the base pressure resulting from the interaction of a supersonic externalstream with a sonic or subsonic jet .
9		105		1.3439548130883399	the asymptotic boundary layer on a circular cylinderin axial incompressible flow .
8		230		1.3491270784293046	interference between the wings and tail plane of aslender wing-body tailplane combination .
7		868		1.394952828088962	design and operation of the n. g. t. e.  thermal shockanalogue .
6		265		1.425291597763025	some instabilities arising from the interaction betweenshock waves and boundary layer .
5		975		1.4457495962627729	one dimensional flows of an imperfect diatomic gas .
4		1327		1.5037289019127715	on the propagation and structure of the blast wave .
3		926		1.5340327729797636	post buckling behaviour of circular cylinderical shellsunder hydrostatic pressure .
2		1254		1.6370409450845784	combustion in the boundary layer on a porous surface .
1		497		1.9475365872364363	theoretical and experimental investigation of thermalstresses in hypersonic aircraft wing structures .

Rank	DocId	W2				Title
=====================================================================================
10		1042		4.757460400575908	on transverse vibrations of thin, shallow elastic shells .
9		493		4.777413656168984	real-gas laminar boundary layer skin friction and heattransfer .
8		265		4.780028740363998	some instabilities arising from the interaction betweenshock waves and boundary layer .
7		409		4.7885346717231405	on the base pressure resulting from the interaction of a supersonic externalstream with a sonic or subsonic jet .
6		247		4.798139799030486	the calculation of the pressure distribution on thickwings of small aspect ratio at zero lift in subsonicflow .
5		1327		4.845056780000772	on the propagation and structure of the blast wave .
4		230		4.874768091512582	interference between the wings and tail plane of aslender wing-body tailplane combination .
3		105		4.937235178152989	the asymptotic boundary layer on a circular cylinderin axial incompressible flow .
2		1254		4.947846885082543	combustion in the boundary layer on a porous surface .
1		497		5.1630587987873025	theoretical and experimental investigation of thermalstresses in hypersonic aircraft wing structures .

Q17
[about, bodi, can, flow, potenti, problem, reduc, revolut, threedimension, transvers, twodimension]
Rank	DocId	W1				Title
=====================================================================================
10		1200		1.2729030351296435	hypersonic viscous flow over a sweat-cooled flat plate .
9		915		1.2987006933704324	a buckled plate in a supersonic stream .
8		105		1.3015646515503911	the asymptotic boundary layer on a circular cylinderin axial incompressible flow .
7		926		1.3252719878163248	post buckling behaviour of circular cylinderical shellsunder hydrostatic pressure .
6		1300		1.3718130973787033	some effects of bluntness on boundary layer transitionand heat transfer at supersonic speeds .
5		372		1.3951950178705057	an experimental investigation of flow about simpleblunt bodies at a nominal mach number of 5. 8.
4		1280		1.4090330356055718	wings with minimum drag due to lift in supersonic flow .
3		497		1.4261260928146526	theoretical and experimental investigation of thermalstresses in hypersonic aircraft wing structures .
2		93		1.4401620384944707	the supersonic blunt body problem - review and extensions .
1		1107		1.6177022144127753	the flow field over blunted flat plates and its effecton turbulent boundary growth and heat transfer at amach number of 4. 7.

Rank	DocId	W2				Title
=====================================================================================
10		409		4.791877630637888	on the base pressure resulting from the interaction of a supersonic externalstream with a sonic or subsonic jet .
9		444		4.7966261342433025	an approach to the flutter problem in real fluids .
8		699		4.8085870294396145	approximate indical lift functions for several wings of finite span inincompressible flow as obtained from oscillatory lift coefficients .
7		915		4.81308335374948	a buckled plate in a supersonic stream .
6		1280		4.833416130973228	wings with minimum drag due to lift in supersonic flow .
5		335		4.837003000684199	the interaction between boundary layer and shock waves in transonicflow .
4		1300		4.839664969182215	some effects of bluntness on boundary layer transitionand heat transfer at supersonic speeds .
3		497		4.891911507418108	theoretical and experimental investigation of thermalstresses in hypersonic aircraft wing structures .
2		1107		4.931526638320848	the flow field over blunted flat plates and its effecton turbulent boundary growth and heat transfer at amach number of 4. 7.
1		105		4.937235178152989	the asymptotic boundary layer on a circular cylinderin axial incompressible flow .

Q18
[angl, attack, avail, bodi, distribut, experiment, pressur, revolut]
Rank	DocId	W1				Title
=====================================================================================
10		1103		1.1095042055332054	pressures, densities and temperatures in the upper atmosphere .
9		121		1.1245854003378255	a theory for base pressures in transonic and supersonicflow .
8		1351		1.1279661336221483	exploratory tests of the effects of jet plumes on theflow over cone- cylinder flare bodies .
7		1230		1.1396793382390134	hypersonic nozzle expansion of air with atom recombinationpresent .
6		55		1.1998544497646937	separation, stability and other properties of compressiblelaminar boundary layer with pressure gradient and heattransfer .
5		497		1.2031849211184777	theoretical and experimental investigation of thermalstresses in hypersonic aircraft wing structures .
4		926		1.2656053888735816	post buckling behaviour of circular cylinderical shellsunder hydrostatic pressure .
3		233		1.2735652791312906	the theoretical wave drag of some bodies of revolution .
2		247		1.3195938114166297	the calculation of the pressure distribution on thickwings of small aspect ratio at zero lift in subsonicflow .
1		196		1.3789817662810022	pressure distributions . axially symmetric bodies inoblique flow .

Rank	DocId	W2				Title
=====================================================================================
10		121		3.610273108848537	a theory for base pressures in transonic and supersonicflow .
9		1230		3.621392670919107	hypersonic nozzle expansion of air with atom recombinationpresent .
8		926		3.622508178954292	post buckling behaviour of circular cylinderical shellsunder hydrostatic pressure .
7		1351		3.625569266395216	exploratory tests of the effects of jet plumes on theflow over cone- cylinder flare bodies .
6		491		3.6341534616213416	on the close relationship between turbulent plane-couetteand pressure flows .
5		55		3.6425510554270875	separation, stability and other properties of compressiblelaminar boundary layer with pressure gradient and heattransfer .
4		233		3.6667684161501652	the theoretical wave drag of some bodies of revolution .
3		497		3.6943834255141326	theoretical and experimental investigation of thermalstresses in hypersonic aircraft wing structures .
2		196		3.726289715271606	pressure distributions . axially symmetric bodies inoblique flow .
1		247		3.7267349955555042	the calculation of the pressure distribution on thickwings of small aspect ratio at zero lift in subsonicflow .

Q19
[basic, combin, consider, doe, dynam, effect, exist, good, realist, reentri, rel, result, simplic, treatment]
Rank	DocId	W1				Title
=====================================================================================
10		192		1.7204769517409115	on the hypersonic viscous flow past slender bodiesof revolution .
9		986		1.7363332263954	design and test of mixed-flow impellers, viii - comparison of experimentalresults for three impellers with shroud redesigned by rapidapproximate method .
8		1118		1.760234199194234	elastic stability of orthotropic shells .
7		224		1.7725508851117817	quasi-cylindrical surfaces with prescribed loadingsin the linearised theory of supersonic flow .
6		432		1.7743340276298036	theoretical damping in roll and rolling moment dueto differential wing incidence for slender cruciformwings and wing-body combinations .
5		672		1.777675774860185	tunnel interference effects .
4		926		1.7933094765549864	post buckling behaviour of circular cylinderical shellsunder hydrostatic pressure .
3		1238		1.8134314823533084	the newtonian approximation in magnetic hypersonicstagnation-point flow .
2		139		1.9027515838310416	viscous effects on pitot tubes at low speeds .
1		81		2.006373007023714	compressible laminar flow and heat transfer about arotating isothermal disk .

Rank	DocId	W2				Title
=====================================================================================
10		986		5.8974318119529805	design and test of mixed-flow impellers, viii - comparison of experimentalresults for three impellers with shroud redesigned by rapidapproximate method .
9		452		5.898202144147609	symmetric joukowsky airfoils in shear flow .
8		841		5.916905832619968	on the bending of circular cylindrical shells underpure bending .
7		139		5.9247596576024595	viscous effects on pitot tubes at low speeds .
6		1278		5.929542947775009	transition in a separated laminar boundary layer .
5		1051		5.936859555647906	the stability of thin-walled unstiffened circular cylindersunder axial compression including the effects of internalpressure .
4		710		5.941872823948536	the smallest height of roughness capable of affecting boundary-layertransition .
3		712		5.964706699918431	low-speed longitudinal aerodynamic characteristics associated with aseries of low-aspect ratio wings having variations in leading-edgecontour .
2		81		5.981204726018326	compressible laminar flow and heat transfer about arotating isothermal disk .
1		705		5.988228434000721	on the kernel function of the integral equation relating the lift anddownwash distributions of oscillating finite wings in subsonic flow .

Q20
[anyon, condit, convect, current, determin, flow, formal, free, gener, ha, heat, induc, influenc, joul, magnetohydrodynam, produc, under]
Rank	DocId	W1				Title
=====================================================================================
10		76		1.9052295714689444	flight measurement of wall pressure fluctuations andboundary-layer turbulence .
9		797		1.9269702215023936	a study of the effect of leading-edge modifications on the flow overa 50degree sweptback wing at transonic speeds .
8		266		1.9489618129250623	exact solution of the neumann problem . calculationfor non- circulatory plane and axially symmetric flowsabout or within arbitrary boundaries .
7		1200		1.951205559652379	hypersonic viscous flow over a sweat-cooled flat plate .
6		243		1.952577680569136	investigation with an interferometer of the turbulentmixing of a free supersonic jet .
5		43		1.9674615530289465	the relation between wall temperature and the effectof roughness on boundary layer transition .
4		624		1.982813741917843	cruise performance of channel-flow ground effect machines .
3		328		2.004410309649081	the boundary layer near the stagnation point in hypersonicflow past a sphere .
2		499		2.3876087904135495	a closed-form solution for the oscillations of a vehicleentering a planetary atmosphere .
1		269		2.4448214786162366	on a laminar free-convection flow and heat transferof electrically conducting fluid on a vertical flatplate in the presence of a transverse magnetic field .

Rank	DocId	W2				Title
=====================================================================================
10		407		6.7846588935470775	stationary convection flow of an electrically conductingliquid between parallel plates in a magnetic field .
9		583		6.792895925399108	influence coefficients for real gases .
8		87		6.817343079631593	free-convection magnetohydrodynamic flow past a porous flat plate .
7		406		6.8229103484797	on the behaviour of boundary layers at supersonic speeds .
6		266		6.829601807555385	exact solution of the neumann problem . calculationfor non- circulatory plane and axially symmetric flowsabout or within arbitrary boundaries .
5		267		6.842455261603568	steady and transient free convection of an electricallyconducting fluid from a vertical plate in the presenceof a magnetic field .
4		449		6.852355188232912	interaction of a charged satellite with the ionosphere .
3		86		6.860249359237659	inviscid-incompressible flow theory of static peripheraljets in proximity to the ground .
2		269		7.109083818300913	on a laminar free-convection flow and heat transferof electrically conducting fluid on a vertical flatplate in the presence of a transverse magnetic field .
1		499		7.233543334512581	a closed-form solution for the oscillations of a vehicleentering a planetary atmosphere .
```
---
2. Identify which documents (of the top 10 ones that you return) you think are relevant and non-relevant for each query. (20 points) 

```
Q1 - W1
Relevant Document - 877, 13, 572, 485,
Non_relevant Document - 575, 1146, 791, 11, 328, 50

Q1 - W2
Relevant Document - 12, 877, 572, 485,
Non_relevant Document - 878, 140, 943, 745, 11, 50

Q2 - W1
Relevant Document - 1379, 99, 13, 1168
Non_relevant Document - 1146, 791, 745, 50, 11, 171

Q2 - W2
Relevant Document - 883, 809, 1168, 99
Non_relevant Document - 171, 833, 1088, 745, 50, 11

Q3 - W1
Relevant Document - 398. 1071, 90, 4
Non_relevant Document - 343, 578, 541, 89, 484, 143

Q3 - W2
Relevant Document - 5, 180, 90, 4, 398
Non_relevant Document - 578, 541, 143, 484, 89

Q4 - W1
Relevant Document - 574, 1314, 165
Non_relevant Document - 109, 575, 23, 487, 328, 184, 1060

Q4 - W2
Relevant Document - 1084, 166, 1314, 1274, 165
Non_relevant Document - 1254, 1188, 184, 1060, 487

Q5 - W1
Relevant Document - 328, 1295, 624, 551
Non_relevant Document - 942, 967, 1031, 162, 102, 400

Q5 - W2
Relevant Document - 487, 624, 1295, 551 
Non_relevant Document - 354, 942, 967, 400, 1031, 102

Q6 - W1
Relevant Document - 1074, 314, 98, 797
Non_relevant Document - 405, 766, 521, 639, 256, 490

Q6 - W2
Relevant Document - 1074, 98
Non_relevant Document - 882, 1362, 766, 1195, 141, 405, 256, 490

Q7 - W1
Relevant Document - 231, 55, 121, 372, 1039
Non_relevant Document - 1230, 233, 123, 56, 491

Q7 - W2
Relevant Document -  247, 372, 231, 121, 55
Non_relevant Document - 433, 1230, 123, 56, 491

Q8 - W1
Relevant Document - 231, 1103, 491, 121
Non_relevant Document - 946, 68, 1230, 432, 233, 687

Q8 - W2
Relevant Document -  442, 231, 1230, 491, 121
Non_relevant Document - 123, 233, 247, 68, 687

Q9 - W1
Relevant Document - 100, 101, 269, 305
Non_relevant Document - 1203, 1214, 21, 20, 570, 44

Q9 - W2
Relevant Document -  982, 269, 101, 305
Non_relevant Document - 397, 1214, 570, 21, 20, 44

Q10 - W1
Relevant Document - 1263, 1312, 328,
Non_relevant Document - 109, 1213, 271, 1198, 948, 301, 492

Q10 - W2
Relevant Document -  615, 690, 1009, 301
Non_relevant Document - 1198, 404, 435, 523, 948, 492

Q11 - W1
Relevant Document - 27, 1309, 1279, 24
Non_relevant Document - 1374, 1247, 1355, 555, 71, 494

Q11 - W2
Relevant Document - 27, 1326, 1185
Non_relevant Document - 737, 304, 71, 471, 653, 555, 494

Q12 - W1
Relevant Document - 324, 1208, 703, 623
Non_relevant Document - 940, 269, 1163, 791, 328, 965

Q12 - W2
Relevant Document - 703, 649, 623
Non_relevant Document - 1222, 542, 1163, 1231, 940, 1220, 965

Q13 - W1
Relevant Document - 659, 1267, 642, 902, 495
Non_relevant Document - 800, 926, 796, 198, 519

Q13 - W2
Relevant Document -  439, 37, 642, 902, 495
Non_relevant Document - 414, 879, 198, 312, 519

Q14 - W1
Relevant Document - 63, 334, 1363
Non_relevant Document - 290, 568, 438, 255, 344, 169, 797

Q14 - W2
Relevant Document -  63, 1363, 334
Non_relevant Document - 568, 290, 344, 438, 255, 797, 169

Q15 - W1
Relevant Document - 1339, 1042, 462, 81
Non_relevant Document - 1126, 1023, 1096, 541, 1024, 461

Q15 - W2
Relevant Document -  1339, 1042, 81, 462
Non_relevant Document - 816, 1064, 541, 1098, 1024, 461

Q16 - W1
Relevant Document - 105, 230, 926, 497
Non_relevant Document - 409, 868, 265, 975, 1327, 1254

Q16 - W2
Relevant Document - 1042, 105, 497
Non_relevant Document - 493, 265, 409, 247, 1327, 1254

Q17 - W1
Relevant Document - 915, 105, 497, 93, 1107
Non_relevant Document - 1200, 926, 1300, 372, 1280

Q17 - W2
Relevant Document - 409, 915, 497, 1107, 105
Non_relevant Document - 444, 699, 1280, 335, 1300,

Q18 - W1
Relevant Document - 121, 1351, 497, 196
Non_relevant Document - 1103, 1230, 55, 926, 233, 247

Q18 - W2
Relevant Document - 121, 1352, 497, 196
Non_relevant Document - 1230, 926, 491, 55, 233, 247

Q19 - W1
Relevant Document - 1118, 224, 926, 1238
Non_relevant Document - 192, 986, 432, 672, 139, 81

Q19 - W2
Relevant Document - 1051, 710, 712, 705
Non_relevant Document - 986, 452, 841, 139, 1278, 81

Q20 - W1
Relevant Document - 796, 266, 1200
Non_relevant Document - 76, 243, 43, 624, 328, 499, 269

Q20 - W2
Relevant Document - 407, 266, 269
Non_relevant Document - 583, 87, 406, 267, 229, 86, 499
```

3. Describe why the top-ranked non-relevant document for each query did not get a lower
score. (15 points)

Tf for each term should be high or document frequency should be low, which mean you would 
get higher weight for that term. Sometimes non relevant term frequency would play a huge 
part because of its high score eventhough it didnt occur in the query.  Also, if the inverse
doc freq is high, and the query is not realted to the document, so the document's score would be high.

4. Briefly discuss the different effects you notice with the two weighting schemes, either on
a query-by-query basis or overall, whichever is most illuminating. (10 points)
 - W1 score is mostly less than W2 score
 - TF and DF are important criteria for finding out the weights. Also the top 10 documents for each
weights for the same query are almost the same.

5. Describe the design decisions you made in building your system
- Porter Stemmer was used for stemming.
- Complex Dictionary with the following structure was used 
```
TreeMap<Integer(DocId), TreeMap<String(Token), Integer(NoOfTimesTokenOccured)>> 
```
  to find the Term Frequency, Document Frequency and Occurrence of most frequent term in a document
- Priority Queue was used to find out the top 10 documents for W1 and W2.
- Tokenization was used for getting rid of unwanted information such as XML tags
