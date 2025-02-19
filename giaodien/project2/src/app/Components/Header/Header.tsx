import Link from 'next/link'
import { IoHomeOutline } from "react-icons/io5";
import { CiSearch } from "react-icons/ci";
import { IoIosLogIn } from "react-icons/io";
import { IoPersonAddOutline } from "react-icons/io5";
export const Header =()=>{
    return (
    
            <div className="header w-[300px] h-screen bg-[#1A1A1A]   ">
                    <div className="inner_wrap w-full h-full ">
                        <div className="logo mb-[48px]">
                            <div className='flex justify-center items-center '>
                                <img src="images/Header/Logo/Rectangle 10.png" alt="logo"  className='w-[257px] overflow-hidden m-[10px]' />
                            </div>
                            <div className="title items-center justify-center flex text-white text-center font-bold text-2xl mt-[11px]">
                                Quản Lý Toàn Nhà
                            </div>
                            
                        </div>
                        <div className="menu">
                            <ul className="list-none p-0 m-0" >
                                <li className='mb-[40px] hover:bg-[#FF6B00]'>
                                    <Link href="/" className='flex gap-[15px] '> 
                                        <IoHomeOutline className='w-[24px] h-[24px] text-white' />
                                        <div className="title font-[700] text-[20px] text-white ">Home</div>
                                    </Link>
                                </li>
                                <li className=' mb-[40px] hover:bg-[#FF6B00]'>
                                    <Link href="/Search" className='flex gap-[15px] '> 
                                        <CiSearch className='w-[24px] h-[24px] text-white' />
                                        <div className="title  font-[700] text-[20px] text-white ">Tìm Kiếm</div>
                                    </Link>
                                </li>
                                <li className='mb-[40px]  hover:bg-[#FF6B00]'>
                                     <Link href="/"className='flex  gap-[15px] '> 
                                        <IoIosLogIn className='w-[24px] h-[24px] text-white'/>
                                        <div className="title font-[700] text-[20px] text-white">Đăng Nhập</div>
                                    </Link>
                                </li>
                                <li className='  hover:bg-[#FF6B00]' >
                                     <Link href="/"className='flex  gap-[15px]'> 
                                       < IoPersonAddOutline className='w-[24px] h-[24px] text-white'/> 
                                        <div className="title  font-[700] text-[20px] text-white">Đăng Kí</div>
                                    </Link>
                                </li>
                            </ul>
                        </div>
                    </div>
            </div>
        
        
    )
}